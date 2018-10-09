# Lesson 03 - Basic Robot Program

1. Pre-Requisites
    1. Internet connection
    1. Git

1. Clone the basic robot repository from GitHub
    1. Run the following command in a terminal window. This will create a folder called `Basic-Robot-Java` wherever your terminal window is opened.

    `git clone https://github.com/5190GreenHopeRobotics/Basic-Robot-Java`

1. Open the project in IntelliJ
    1. Click the "Open" button in IntelliJ. Navigate to the folder that you cloned in the previous step. The folder should have a green Gradle icon. Click on the **folder** (not a file).
    1. This will open a Gradle import window. Keep the default settings and click "Ok".
    1. IntelliJ will now proceed to setup the project. If prompted for "Import Gradle" vs "Enable Auto Import" click "Enable Auto Import".
    1. It will take some time for IntelliJ to download the required dependencies. Once everything is finished, you will be notified.

1. Build and Deploy
    1. The code in `src/main/java/org/ghrobotics/robot/Robot.java` is setup so that you can drive the robot around using an Xbox controller. To deploy this code onto the robot, open a terminal window to the proejct location (Alt-F12 in IntelliJ for the embedded terminal window if you don't want to use an extermal window) and type in the following command.
    
    `./gradlew deploy`

1. Make the following changes to your program, rebuild, redeploy, and test your code.
    1. Make the robot move slower when you press the controls on the Xbox controller.
    1. Make the robot move forward in autonomous until the robot is disabled.
    1. Make the robot move forward for 5 seconds during autonomous.
    1. Make the robot move bacward for 5 seconds during autonomous.

1. What classes and methods did you see in this program? Where is the main method? Can you explain the flow of the program?


