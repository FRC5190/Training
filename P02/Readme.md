# Programming Lesson 02 - Hello world

In this lesson, we will deploy our first program to the Robot and make it print "Hello world".

First, make sure that you have installed all the necessary software in P01. Now open the FRC Driver Station from the Start Menu. Then connect to the Robot's Wi-Fi network. The network name is usually `5190_robotName`.

Once the Driver Station is open, make sure that your RoboRIO is correctly imaged. If you do not see a 2018 RIO Image, follow these [instructions](https://wpilib.screenstepslive.com/s/currentCS/m/getting_started/l/144984-imaging-your-roborio) to re-image the RoboRIO.

![DS](images/ds.png?raw=true "DS")

Next, open the project in IntelliJ by clicking on `Open`. Navigate to the P02 root and click on the Gradle icon. Navigate through the file tree to `src/main/resources/frc/team5190/robot/Robot.kt`. This is the main robot file.

You might see a message in the bottom right corner about Gradle. Click `Enable Auto Import`. This means that whenever a `build.gradle` file is changed, IntelliJ IDEA will automatically rebuild the project.

The main Robot class inherits from another class called `TimedRobot`. This is the class that contains the default `autonomousInit()`, `teleopPeriodic()`,etc.  methods:

* `robotInit()` is called once when the code is started up.
* `robotPeriodic()` is always called every 20 ms regardless of whether enabled or disabled.
* `autonomousInit()` is called when autonomous is enabled.
* `autonomousPeriodic()` is called every 20 ms during autonomous.
* `teleopInit()` is called when teleop is enabled.
* `teleopPeriodic()` is called every 20 ms during teleop.
* `disabledInit()` is called when the robot is disabled.
* `disabledPeriodic()` is called every 20 ms when the robot is disabled.

Note that not all of these methods have been implemented in the `Robot` class. You should override and implement these methods as you find uses for them.

To make sure your code runs on the RoboRIO, you need to deploy your code onto the robot. Click on the `Gradle` button on the right side of the screen. Then go under `P02/Tasks/embeddedtools/deploy`. Double click on this item. A new task will open in a console window and code will begin to deploy to the RoboRIO. Make sure you are connected to the Robot over Wi-Fi.

![IntelliJ](images/idea1.png?raw=true "IntelliJ")

You should see a window similar to the one below once everything has completed. Also note the run configuration at the top right of the screen. From now onwards, you can click the Play button to deploy code to the RoboRIO.

![IntelliJ](images/idea2.png?raw=true "IntelliJ")

Now open the Console on the FRC Driver Station by clicking on the Gear Icon to the right of the Battery Voltage Indicator.. You should see the "Hello World" message printing every 5 seconds.

![Console](images/console.png?raw=true "Console")

Congratulations! You have completed P02. For practice, print "Hello World" for the following scenarios:

* Only when autonomous is running.
* Only when teleop is running.
* Every 20 ms regardless of enabled or disabled.
* Print for 5 seconds during autonomous and stop printing afterwards.