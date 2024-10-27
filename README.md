# advent-of-code-template (Java)
Welcome to the Advent of Code template for the Java language! Java is a multiplatform, statically typed programming language.

## Prerequisites
To compile this project, you should install a JDK.
To do so, the easiest way is to run a prebuilt distribution installer. I recommend [Adoptium](https://adoptium.net/),
or [OpenJDK](https://jdk.java.net) if you want to manually install. Any Java version should be fine, since Gradle
(the tool this template uses to configure, compile and run the project) downloads an appropriate distribution for compilation anyway
(if it cannot detect one).

## Usage
1. Get your puzzle input, which you can download from the bottom of the puzzle webpage. You can also use an external tool, like [`advent-of-code-data`](https://github.com/wimglenn/advent-of-code-data) (aocd).
2. Put the puzzle input in the `inputs` directory. More information can be found in the [README there](inputs/README.md). 
3. Create a file in the `src/main/java` directory, like `Day05.java` for day 5. You can copy over the example code for day 1.
4. Solve the problem, write some code for it, and run it. The section below covers how running Java code works.

## Running
Select your tool of preference below:

<details>
    <summary>IntelliJ Idea <b>(recommended)</b></summary>
    In IntelliJ Idea, you can run the code by simply clicking the green play button next to the main function:
    <img src="screenshots/run_intellij.png" alt="Green play button in IntelliJ Idea">
</details>
<details>
    <summary>From the command line</summary>
If you are on a Unix-like system, make sure that `gradlew` is executable:

    chmod +x gradlew

Then run using:

    ./gradlew run --class Dayxx

replacing the `xx` with the two-digit day number.
</details>
<details>
    <summary>Visual Studio Code with Java plugin</summary>
    Click the Run button in the Debug tab or press F5, while having the file you want to run open.
</details>

## Directory structure
An overview of the directory structure:
```
advent-of-code-template
├── inputs
│   └── xx.txt              Puzzle input files for each day
│
├── src/main/java
|   ├── Day01.java          Template code for Day 1
│   └── Inputs.java         Contains some utility functions for loading puzzle inputs
│
├── README.md               This file
├── build.gradle.kts        Gradle configuration (do not worry about it too much)
├── settings.gradle.kts     Gradle configuration
└── gradle/, gradlew        Gradle configuration/distribution
```
