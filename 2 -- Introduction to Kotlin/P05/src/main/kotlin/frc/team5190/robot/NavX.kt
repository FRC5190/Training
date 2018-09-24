package frc.team5190.robot

import com.kauailabs.navx.frc.AHRS
import edu.wpi.first.wpilibj.SPI
import jaci.pathfinder.Pathfinder

object NavX : AHRS(SPI.Port.kMXP) {

    init {
        reset()
    }

    var angleOffset = 0.0

    val correctedAngle: Double
        get() = Pathfinder.boundHalfDegrees(-angle + angleOffset)
}