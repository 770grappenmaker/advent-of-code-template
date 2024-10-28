# advent-of-code-template (Rust)
Welcome to the Advent of Code template for Rust! Rust is a statically
typed, systems programming language which, instead of manual allocations or
a garbage collector, uses a novelty memory model called the "borrow checker".

## Prerequisites
- Please first install rustup (install from https://rustup.rs) because the
    template has specified a minimum rust version that it will work with.
- curl in your PATH (this is probably already the case but it is needed)

## Usage
1. Get your puzzle input from the website and save it to `inputs/day-%02d.txt`. You
    can also write your cookie header to `session.txt` and use `cargo get-day %d`.
2. Write your solution to `day/src/day%02d.rs`, with a `pub fn part1` and a `pub fn part2` (see `day/src/day01.rs` for a template).
3. You can add any dependencies you need to `day/Cargo.toml`. Some common ones
   like itertools and anyhow are already there but commented.
3. Run `cargo run-day %d` to get the solutions.
4. Copy-paste them into the submission field.
