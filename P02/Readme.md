# Programming Lesson 02 - Hello world

In this lesson, we will deploy our first program to the Robot and make it print "Hello world". By the time you complete this lesson, you will understand the following:

* Ensure that the robot has the correct software to run your programs
* Basic structure of a FRC program
* Use GradleRio to build and deploy your program
* Tele-operated and autonomous modes of the robot
* Use the FRC Driver Station to connect to the robot and switch between the two modes
* Run timed operations on the robot

Before beginning this lesson, make sure that you have completed all the steps in [P01](../P01/readme.md). Also, you need a FRC robot that you can work with. For the purpose of this lesson, all that is needed in your robot is a roboRIO controller, power supply, and a wireless network router. You won't really be driving the robot in this lesson, and hence won't need any motors or drive train yet.

## Connecting to roboRIO

FRC robots use Network Instrument's [roboRIO](https://forums.ni.com/t5/FIRST-Robotics-Competition/roboRIO-Details-and-Specifications/ta-p/3494658) to run your programs and to communicate with all the hardware of the robot. In this section you will connect from your laptop's FRC Driver Station to the roboRIO controller using the robot's wireless router.

1. Switch on your FRC robot, and wait for a few minutes for its wireless network to be ready. Someone on your team should have already wired up the wireless network router to the roboRIO. And, your laptop should discover the wireless network. Connect your laptop to the robot's wireless network. Note that when your laptop is connected to the wireless network of the robot, it won't have any Internet access.

1. Launch FRC Driver Station on your laptop. The Driver Station should automatically connect to the robot's wireless network. The primary indication of this is that you will see the robot's battery voltage appear on your Driver Station. If this does not happen, check one of the following:

 * Check whether your laptop is connected to the robot's wireless network.
 * Check if your firewall is blocking the connection by disabling the firewall.

1. You need to ensure that that your roboRIO is correctly imaged. In other words, it should have the correct operating system and libraries to run your programs. With the FRC Driver Station connected to your robot, check the connection tab and verify the version of the RIO image as shown below.

![DS](images/ds.png?raw=true "DS")

If it says 2018_v16 or above, you are good to go. Otherwise, follow these [instructions](https://wpilib.screenstepslive.com/s/currentCS/m/getting_started/l/144984-imaging-your-roborio) to image the RoboRIO. You will need an appropriate USB cable for this step. If you re-image the roboRIO, wait for the controller to restart, and then ensure that you can connect from your laptop's FRC Driver Station to the robot.

## Build and deploy code using GradleRIO

It is time for us to try a simple program. The P02 folder comes with the simplest **Hello world** program. Let us build this program and deploy it to the robot using IntelliJ IDE. In all of our lessons, we use two tools - Gradle and GradleRIO - to build and deploy our code. [Gradle](https://gradle.org/) is a popular build tool for Java programs. [GradleRIO](https://github.com/wpilibsuite/GradleRIO) is a Gradle plugin for FRC programs that has been written specifically by the FRC community. You do not have to understand Gradle or GradleRIO to follow through these lessons. However, for more advanced work, it is recommended that you become familiar with these tools.

1. Disconnect your laptop from the robot, and connect to the Internet.

1. Clone this entire **Training** repository from GitHub to your desktop using Git by running the following from command prompt:
```
git clone https://github.com/5190GreenHopeRobotics/Training
```
Now, you should have the entire contents of this repository on your laptop.

1. Launch IntelliJ from the start menu. Open the project in IntelliJ by clicking on `Open`. Navigate to and click on the P02 folder. Select 'OK' on the import dialog. This should open the project in your IDE. The first time you open the project, it will sync all the dependencies needed for your project. This can take a while the first time.

1. Select **View** -> **Tool buttons** to ensure that tool buttons for Gradle show up always in your IntelliJ IDE on the right side.

1. Now that you have all the code and dependencies on your laptop, connect your laptop to the robot wireless network. Make sure that you have the FRC Driver Station open, and that you are connected to the robot. 

1. To deploy your code onto the robot, click on the `Gradle` tool button on the right side of the screen in IntelliJ. Then select the `deploy` task under `P02/Tasks/embeddedtools`. Double click on this item. A new task will open in a console window and code will begin to deploy to the RoboRIO. Make sure you are connected to the Robot over Wi-Fi.

![IntelliJ](images/idea1.png?raw=true "IntelliJ")

1. You should see a window similar to the one below once everything has completed. Also note the run configuration at the top right of the screen. From now onwards, you can click the Play button to deploy code to the RoboRIO.

![IntelliJ](images/idea2.png?raw=true "IntelliJ")

1. Now open the Console on the FRC Driver Station by clicking on the Gear Icon to the right of the Battery Voltage Indicator. You should see the "Hello World" message printing every 5 seconds.

![Console](images/console.png?raw=true "Console")

## Structure of the robot program

1. Navigate through the file tree to `src/main/resources/frc/team5190/robot/Robot.kt`. This is the main robot file. The main Robot class inherits from another class called `TimedRobot`. This is the class that contains the default `autonomousInit()`, `teleopPeriodic()`, etc.  methods:

* `robotInit()` is called once when the code is started up.
* `robotPeriodic()` is always called every 20 ms regardless of whether enabled or disabled.
* `autonomousInit()` is called when autonomous is enabled.
* `autonomousPeriodic()` is called every 20 ms during autonomous.
* `teleopInit()` is called when teleop is enabled.
* `teleopPeriodic()` is called every 20 ms during teleop.
* `disabledInit()` is called when the robot is disabled.
* `disabledPeriodic()` is called every 20 ms when the robot is disabled.

Note that not all of these methods have been implemented in the `Robot` class. You should override and implement these methods as you find uses for them.

1. To understand some of the above methods, try to make the following changes to your program, then deploy and test it.

* Make the program print `Hello world` every 5 seconds, only when the robot is in autonomous mode.
* Make the program print `Hello world` every 5 seconds, only when the robot is in teleop mode.
* Make the program print `Hello world` every 20 ms regardless of enabled or disabled.
* Make the program print `Hello world` every 20 ms for 5 seconds during autonomous and stop printing afterwards.
