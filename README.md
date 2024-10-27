# advent-of-code-template (Python)
Welcome to the Advent of Code template for Python! Python is a dynamically typed, multiplatform programming language.

## Prerequisites
This template is split up in two different styles:
- The default one, a very basic Python file with no extra funny business, where one downloads their own puzzle inputs
- A slightly more abstract Python file that does the puzzle input downloading for you
If you choose to use the second style, please read [the instructions](alternative.md). The rest of this README assumes you will use the first style.

Install Python 3 from the [official downloads page](https://www.python.org/downloads/).

## Usage
1. Get your puzzle input, which you can download from the bottom of the puzzle webpage. You can also use an external tool, like advent-of-code-data (aocd). If you do, it might be easier to use the [alternative style](alternative.md), which already uses `aocd`.
2. Put the puzzle input in the inputs directory. More information can be found in the README there.
3. Create a Python file, like `day05.py` for day 5. You can copy over the example code for day 1.
4. Solve the problem, write some code for it, and run it. The section below covers how running Python code works.

## Running
Running is as simple as opening a terminal and running:
```shell
python dayxx.py
```
replacing `xx` with the two-digit day number.