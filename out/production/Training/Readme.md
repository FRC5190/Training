# Lesson 02 - Object Oriented Programming

1. Create a class called `Robot` with the following methods:
    * A constructor that stores the name of the Robot
    * A method called `autonomous` that prints `"Starting Autonomous"`
    * A method called `teleop` that prints `"Starting Teleop"`

1. Create a class called `Driver` that has the `main` method. This class should do the following:
    * Create a new `Robot` object
    * Run a loop asking for user input
    * If the user presses “T”, then it calls the robot’s teleop method. If the user presses “A" it calls the robot’s autonomous method. If the user presses “X”, it quits.

1. Create a class called `GreenHope` as a derived class of `Robot`. Implement the following variations. For each variation, change the Driver class to use the new `GreenHope` object instead of the `Robot` object.
    * Do not override any of the methods
    * Override the methods to print messages like `"Starting Autonomous in GreenHope"`
    * Override the methods to print both the messages -- from the base class and the derived class.

1. Experiment with variations of `Robot` and `GreenHope` class to answer the following questions:
    1. Can you change a variable defined in the base class from a method in a derived class?
    1. Can you force the implementation of a method in the base class to be invoked wven when using an object of the derived class?