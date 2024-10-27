from os import environ
from os.path import abspath

environ["AOCD_CONFIG_DIR"] = abspath("aocd")

from aocd import get_data
input = get_data(year=2024, day=1) # change the day here

# Write the following if you want lines instead:
# input = input.splitlines()

# Your code here!
# ...

# Once you have a solution, print it
part_one = len(input)
print(f"Part one: {part_one}")