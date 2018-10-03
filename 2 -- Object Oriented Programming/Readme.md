# Lesson 02 - Object Oriented Programming

1. Create a class called `Robot` with the following methods:
    * A constructor that stores the name of the Robot
    * A method called `autonomous` that prints `"Starting Autonomous"`
    * A method called `teleop` that prints `"Starting Teleop"`

1. Create a class called `Driver` that has the `main` method. This class should do the following:
    * Create a new `Robot` object
    * Run a loop asking for user input
    * If the user presses “T”, then it calls the robot’s teleop method. If the user presses “A" it calls the robot’s autonomous method. If the user presses “X”, it quits.