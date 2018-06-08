# Programming Lesson 05 - Path Tracking

Welcome to the Team 5190 training lessons in programming an FRC robot. This chapter concerns the problem of path tracking. Path tracking is an important aspect of every autonomous routine as it ensures a fast and accurate method of getting from point A to point B.

First download and run ```MP Generator.jar```. Using this tool you an generate a trajectory by supllying waypoints. Note that you can change the max velocity, acceleration, and jerk. Make sure to select:

* ```Imperial``` for the ```Units```
* ```Tank``` for the ```Drive Base```
* ```2.458``` for the ```Wheel Base Width``` (This is the distance from the wheels on the left to the wheels on the right)
* ```0.02``` for the ```Time Step``` (This is the time delay between points on the path)
* ```8.0``` for the ```Velocity``` (Max velocity along the path)
* ```3.0``` for the ```Acceleration``` (Max acceleration along the path)
* ```60.0``` for the ```Jerk``` (Max jerk along the path)
* ```Cubic``` for the ```Fit Method``` (The degree of polynomial used to interpolate the waypoints)

Now you can add waypoints by clicking the ```Add Waypoint`` button. Here you may specify the x-coordinate, a y-coordinate, and the angle the robot should be at. After adding each waypoint, you will see the path on the right.

For our purposes, add two waypoints with the specified x, y, and angle:

* ```x: 1.50, y: 23.75, angle: 0```
* ```x: 23.0, y: 22.00, angle: -30```

![This is what your generator should look like.](image.png)

Hit Ctrl-E and export the trajectory to the ```P05/src/main/resources/Test``` folder with the name ```Test``` in the dialog box.  

Navigate to where you saved the trajectory above. You should see three files named:

* ```Test_left_detailed.csv```
* ```Test_source_detailed.csv```
* ```Test_right_detailed.csv```

If you do not have these files, or if you have more than 6 files, please reset the module and start again.

Open the ```build.gradle``` file for P05. You will see a block of code that looks like this:

```groovy
artifact('Test', FileCollectionArtifact) {
            files = project.fileTree(dir: 'src/main/resources/Test')
            directory = '/home/lvuser/paths/Test'
            targets << "roborio"
        }
```

This deploys all files in the ```src/main/resources/Test``` folder to ```/home/lvuser/paths/Test``` on the RoboRIO file system. This makes it easier for the code on the RIO to access the path files.


Now open IntelliJ IDEA and hit the ```open``` option. Navigate to the P05 directory. It should have the Gradle symbol. Once the project is open, head over to ```src/main/kotlin/frc/team5190/drive/FollowPathCommand.kt```. This file contains the code to follow the path that you generated above. Every line of code is explained in the comments. Then head over to ```Robot.kt``` and see how the command is called on ```autonomousInit()```

Finally, generate a path for "Cross Auto" where the robot starts in the same starting position as above (```x: 1.50, y: 23.75, angle: 0```) and heads over the to the right side of the scale. You will need to use more than 3 waypoints for this path. Then try to write the ```PathFollower.kt``` class by yourself. Call the command with the Cross Auto path as arguments and see how well the robot follows the path. Good Luck!