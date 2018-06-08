package frc.team5190.robot.drive

import com.ctre.phoenix.motorcontrol.ControlMode
import edu.wpi.first.wpilibj.GenericHID
import edu.wpi.first.wpilibj.command.Command
import edu.wpi.first.wpilibj.drive.DifferentialDrive
import frc.team5190.Controls

class ManualDriveCommand : Command() {

    private var defaultDeadband = 0.02

    private var stopThreshold = DifferentialDrive.kDefaultQuickStopThreshold
    private var stopAlpha = DifferentialDrive.kDefaultQuickStopAlpha
    private var stopAccumulator = 0.0

    init {
        requires(DriveSubsystem)
    }

    override fun execute() {
        fun applyDeadband(value: Double, deadband: Double) = if (Math.abs(value) > deadband) {
            if (value > 0.0) {
                (value - deadband) / (1.0 - deadband)
            } else {
                (value + deadband) / (1.0 - deadband)
            }
        } else {
            0.0
        }

        var speed = -Controls.getY(GenericHID.Hand.kLeft)
        var rotation = Controls.getX(GenericHID.Hand.kLeft)

        speed = speed.coerceIn(-1.0, 1.0)
        speed = applyDeadband(speed, defaultDeadband)

        rotation = rotation.coerceIn(-1.0, 1.0)
        rotation = applyDeadband(rotation, defaultDeadband)

        val angularPower: Double
        val overPower: Boolean

        if (Controls.xButton) {
            if (Math.abs(speed) < stopThreshold) {
                stopAccumulator = (1 - stopAlpha) * stopAccumulator + stopAlpha * rotation.coerceIn(-1.0, 1.0) * 2.0
            }
            overPower = true
            angularPower = rotation
        } else {
            overPower = false
            angularPower = Math.abs(speed) * rotation - stopAccumulator

            when {
                stopAccumulator > 1 -> stopAccumulator -= 1.0
                stopAccumulator < -1 -> stopAccumulator += 1.0
                else -> stopAccumulator = 0.0
            }
        }

        var leftMotorOutput = speed + angularPower
        var rightMotorOutput = speed - angularPower

        // If rotation is overpowered, reduce both outputs to within acceptable range
        if (overPower) {
            when {
                leftMotorOutput > 1.0 -> {
                    rightMotorOutput -= leftMotorOutput - 1.0
                    leftMotorOutput = 1.0
                }
                rightMotorOutput > 1.0 -> {
                    leftMotorOutput -= rightMotorOutput - 1.0
                    rightMotorOutput = 1.0
                }
                leftMotorOutput < -1.0 -> {
                    rightMotorOutput -= leftMotorOutput + 1.0
                    leftMotorOutput = -1.0
                }
                rightMotorOutput < -1.0 -> {
                    leftMotorOutput -= rightMotorOutput + 1.0
                    rightMotorOutput = -1.0
                }
            }
        }
        DriveSubsystem.set(ControlMode.PercentOutput, leftMotorOutput, rightMotorOutput)
    }

    override fun isFinished() = false
}