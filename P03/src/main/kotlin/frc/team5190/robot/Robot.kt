package frc.team5190.robot

import com.ctre.phoenix.motorcontrol.ControlMode
import com.ctre.phoenix.motorcontrol.can.TalonSRX
import edu.wpi.first.wpilibj.GenericHID
import edu.wpi.first.wpilibj.TimedRobot
import edu.wpi.first.wpilibj.XboxController

class Robot : TimedRobot() {

    // Instantiate a Talon SRX object on port 1
    private val talon = TalonSRX(1)

    // Instantiate an Xbox controller oject
    private val controller = XboxController(0)

    // Timer objects
    private val startTime = 0L


    override fun autonomousInit() {
        // Stores the time at which autonomous was enabled.
        startTime = System.currentTimeMillis()
    }

    override fun autonomousPeriodic() {
        // Execute this code within five seconds of autonomous
        if (System.currentTimeMillis() - startTime < 5L) {
            // Set motor output control mode to a percent
            // Set motor output of 75%
            talon.set(ControlMode.PercentOutput, 0.75)
        }
    }

    override fun teleopPeriodic() {
        // Drive motor at speed from the Y-axis of the left joystick
        // ControlMode.PercentOutput sets a motor percentage.
        // More advanced techniques for setting outputs will be discussed in P04.
        talon.set(ControlMode.PercentOutput, controller.getY(GenericHID.Hand.kLeft))
    }
}