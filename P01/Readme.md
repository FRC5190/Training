# Programming Lesson 01 - Introduction

Welcome to the Team 5190 training lessons in programming a FRC robot. These lessons help prospective FRC programmers get started, understand the basics, and be prepared for developing more advanced software techniques in robotics.

In these lessons, we use:

* [Kotlin](http://kotlinlang.org) as the programming language. Kotlin is a modern developer language that is based on the Java Virtual Machine.
* [IntelliJ IDEA](http://jetbrains.com) as the development environment.
* Most of the lessons require you to develop, deploy, and test your code on a real FRC robot. We will call out the requirements for the robot as we go along. **Team 5190 Falcon Mini** is a robot that we have specifically built to help with this training.

These lessons do not help you with:

* **Teaching the basics of programming:** If you are new to programming, follow the lesson plan and tutorials on Java from [here](https://docs.oracle.com/javase/tutorial/java/) first. You are expected to understand basic elements of programming in Java - classes, objects, inheritance, loops, and conditions.
* **Teaching the Kotlin programming language:** Developers with Java background can easily start using Kotlin. Try the tutorials [here](https://kotlinlang.org/docs/tutorials/) for learning Kotlin.
* **Building the robot:** We will aim to create similar lessons on the mechanical and electrical elements of robot construction in a subsequent series.

Here is an outline of the lessons:

1. **Introduction** covers the essentials needed to set up your development machine.
1. **Hello world** is your first program that you deploy to the robot. It will run on the robot and print a `Hello world` message for you in the FRC dashboard.
1. **Driving a Talon** will help you program a Talon SRX controller. You will program the robot for manual and autonomous driving in this lesson.
1. **Closed-loop control using encoders** will teach you to integrate an encoder to drive a fixed distance.
1. **Debugging issues** will help you learning some techniques to diagnose problems and fix issues.
1. **Path tracking** is an core element of many robots and involves making the robot track a pre-defined path. You will learn the basic elements of path tracking and the complexity of doing this well.
1. **Object recognition** sets up a simple vision pipeline integrated with your robot to recognize objects of a certain color.

In this first lesson, you do not need any robot. We will help you started with the prerequisites on your laptop. You need a **Windows 10** laptop wth 4GB of memory or more, and 50GB or more of free disk space. You cannot use a Mac for these lessons. Follow the steps below.

## Install JDK 8

The Java Development Kit (JDK) is the set of development tools and runtime for Java programs. You will first write the programs on your laptop, compile them on your laptop using the JDK, deploy them to the robot, and then make them run on the robot.

1. Uninstall any older version of Java that you may have on your machine. Look for older versions in `Apps and features` under `Control panel`.
1. You will need `JDK 8` for our lessons. You cannot use `JDK 9` or `JDK 10`. To download `JDK 8`, go to this [location](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html). Look for `Java SE Development Kit 8u172` or a later version, and then download the `Windows x64` version of the JDK.
1. Launch the installer, run through the steps accepting defaults.
1. Set up `JAVA_HOME` and `Path` system environment variables. To do this, look for `System variables` in the Windows search box. In the `System Properties` dialog, and open `Environment Variables`. Then set a new system variable `JAVA_HOME` to `C:\Program Files\Java\jdk1.8.0_172` or whatever location your JDK is installed to. Edit the `Path` system variable to include `C:\Program Files\Java\jdk1.8.0_172\bin` or the bin folder of your JDK.
1. To verify the installation, open a command promot, and type `java -version`. You should see the java version that you installed.

## Install IntelliJ IDEA

IntelliJ is a popular integrated development environment (IDE) for Java developers. You will write the programs using the IntelliJ IDE. IntelliJ uses JDK in order to compile your programs.

1. Uninstall any older version of IntelliJ that you may have on your machine. Look for older versions in `Apps and features` under `Control panel`.
1. Get the latest version of IntelliJ Community Edition from this [location](https://www.jetbrains.com/idea/download/#section=windows).
1. Launch the installer, run through the steps accepting defaults.
1. When you open IntelliJ for the first time, you will be asked to select a theme. Select one. You will also be asked to select any additional plugins. You do not need any.
1. If you are able to launch the IDE, then you have completed this step successfully.

## Install FRC Update Suite

The `FRC Update Suite` is a set of tools necessary for FRC programming. It includes the `FRC driverstation` needed for communication between your laptop and the robot. Downloading and installing the update suite can take an hour or more.

**Note:** You will need an installation key to install this software. Contact your programming team and get the key, before proceeding with this step. Once you get the key, protect it just like any password.

1. Follow the steps in this [location](https://wpilib.screenstepslive.com/s/currentCS/m/getting_started/l/599670-installing-the-frc-update-suite-all-languages) to install FRC Update Suite. It is important that you follow these steps diligently.

2. Once the installation is complete, launch the FRC Driver Station from the Start menu. Select **Settings** and enter your FRC team number as shown below:

 ![Driver Station settings](images/driverstation.png)

Congratulations!! You have set up your laptop as much as you can without having a real robot. Before beginning the next lesson, check with your team and find a FRC robot that you can work with.