from os.path import join

DAY = 1
input_path = join("inputs", f"{DAY:02}.txt")

with open(input_path) as f:
    input_lines = f.readlines()
    # alternatively, write
    # input = f.read()
    # if you want to read the input as text, not as a list of lines

# Your code here!
# ...

# Once you have a solution, print it
part_one = len(input_lines)
print(f"Part one: {part_one}")