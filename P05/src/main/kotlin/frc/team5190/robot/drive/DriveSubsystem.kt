package frc.team5190.robot.drive

import com.ctre.phoenix.motorcontrol.ControlMode
import com.ctre.phoenix.motorcontrol.FeedbackDevice
import com.ctre.phoenix.motorcontrol.NeutralMode
import com.ctre.phoenix.motorcontrol.can.TalonSRX
import edu.wpi.first.wpilibj.command.Subsystem


object DriveSubsystem : Subsystem() {

    private val leftMaster = TalonSRX(1)
    private val rightMaster = TalonSRX(4)

    private val leftSlave1 = TalonSRX(2)
    private val rightSlave1 = TalonSRX(5)

    private val leftSlave2 = TalonSRX(3)
    private val rightSlave2 = TalonSRX(6)

    private val allMasters = arrayOf(leftMaster, rightMaster)

    private val leftMotors = arrayOf(leftMaster, leftSlave1, leftSlave2)
    private val rightMotors = arrayOf(rightMaster, rightSlave1, rightSlave2)

    private val allMotors = arrayOf(*leftMotors, *rightMotors)

    val leftPosition
        get() = leftMaster.getSelectedSensorPosition(0)

    val rightPosition
        get() = rightMaster.getSelectedSensorPosition(0)


    init {
        arrayListOf(leftSlave1, leftSlave2).forEach {
            it.follow(leftMaster)
            it.inverted = false
        }
        arrayListOf(rightSlave1, rightSlave2).forEach {
            it.follow(rightMaster)
            it.inverted = true
        }

        leftMaster.inverted = true
        rightMaster.inverted = false

        allMasters.forEach {
            it.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 10)
            it.setSensorPhase(false)
        }

        allMotors.forEach {
            it.configPeakOutputForward(1.0, 10)
            it.configPeakOutputReverse(-1.0, 10)

            it.configNominalOutputForward(0.0, 10)
            it.configNominalOutputReverse(0.0, 10)

            it.setNeutralMode(NeutralMode.Brake)

            it.configVoltageCompSaturation(12.0, 10)
            it.enableVoltageCompensation(true)

            it.configPeakCurrentLimit(40, 10)
            it.configPeakCurrentDuration(0, 10)
            it.configContinuousCurrentLimit(0, 10)
            it.enableCurrentLimit(true)
        }
    }

    fun set(controlMode: ControlMode, leftOutput: Double, rightOutput: Double) {
        leftMaster.set(controlMode, leftOutput)
        rightMaster.set(controlMode, rightOutput)
    }

    fun resetEncoders() {
        allMasters.forEach {
            it.setSelectedSensorPosition(0, 0, 10)
        }
    }

    override fun initDefaultCommand() {
        defaultCommand = ManualDriveCommand()
    }
}