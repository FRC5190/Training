package frc.team5190.robot

import edu.wpi.first.wpilibj.TimedRobot
import frc.team5190.robot.drive.DriveSubsystem
import frc.team5190.robot.drive.FollowPathCommand

class Robot : TimedRobot() {

    // Initializer
    init {
        DriveSubsystem
        Controls
        NavX
    }

    // Called when autonomous is initialized.
    override fun autonomousInit() {
        // Follow the test path.
        FollowPathCommand(folder = "Test", file = "Test").start()
    }

}