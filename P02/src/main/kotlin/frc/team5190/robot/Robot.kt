package frc.team5190.robot

import edu.wpi.first.wpilibj.TimedRobot

class Robot : TimedRobot() {

    // Stores times when timer is reset
    private var resetTime = System.currentTimeMillis()

    override fun robotPeriodic() {
        // Checks if it has been 5000 ms (5 seconds) since last reset
        if (System.currentTimeMillis() - resetTime > 5000L) {
            // Print "Hello world" and reset timer
            println("Hello World")
            resetTime = System.currentTimeMillis()
        }
    }
}