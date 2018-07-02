# Programming Lesson 03 - Driving a Motor Connected to a Talon SRX

In this lesson, we will drive a motor using a Talon SRX motor controller.

Navigate to `src/main/kotlin/frc/team5190/robot/Robot.kt` and read the code carefully. Here a Talon SRX object is initialized with a port number. Port numbers can be found on the Web Dashboard.

To gain access to the Web Dashboard, you must install Microsoft Silverlight and use the Internet Explorer browser. Once you have this installed, type in `10.TE.AM.2` in the URL box. This will take you to the web dashboard where you can see all the devices that are connected to the Robot.

The sample `Robot` class in this module contains an example to drive the motor in teleop using input from the controller. It also contains an example that drives the motor at 75% for 5 seconds during autonomous.