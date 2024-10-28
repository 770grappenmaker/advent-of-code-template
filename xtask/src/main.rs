use std::fs::File;
use std::io::Write;

use anyhow::Result;
use args::Args;
use getopts::Occur;

fn main() -> Result<()> {
    let mut args = Args::new(
        "aoc-rust-runner",
        "Downloads puzzle inputs and runs Rust solutions to problems",
    );
    args.flag("h", "help", "Print the usage menu");
    args.option(
        "g",
        "get-day",
        "get the puzzle input for a specific day",
        "DAY",
        Occur::Optional,
        None,
    );
    args.option(
        "r",
        "run-day",
        "run the solution file for a specific day",
        "DAY",
        Occur::Optional,
        None,
    );
    args.parse_from_cli()?;

    simple_logger::SimpleLogger::new().init()?;

    if args.value_of("help")? {
        eprintln!("{}", args.full_usage());
        std::process::exit(0);
    } else if let Ok(day) = args.value_of::<String>("get-day") {
        let day: u16 = day.parse()?;
        let input_file = format!("day-{:02}.txt", day);
        devx_cmd::run!(
            "curl",
            "-H",
            "@session.txt",
            "-fsSLo",
            input_file,
            format!("https://adventofcode.com/2024/day/{}/input", day),
        )?;
    } else if let Ok(day) = args.value_of::<String>("run-day") {
        let day: u16 = day.parse()?;
        let mut f = File::create("day/temp.rs")?;
        let input_file = format!("inputs/day-{:02}.txt", day);
        let source_file = format!("src/day{:02}.rs", day);
        writeln!(
            f,
            r#"
            #![allow(unused)]
            include!("{source_file}");
            fn main() {{
                println!("AOC 2024 DAY {day:02}");
                println!("===============");
                let input = std::fs::read_to_string("{input_file}").unwrap();
                let start_time = std::time::Instant::now();
                println!("Part 1: {{}}", part1(input.clone()));
                println!("Part 2: {{}}", part2(input));
                println!("Took {{}} microseconds", start_time.elapsed().as_micros());
            }}
        "#
        )?;
        drop(f);
        let _ = devx_cmd::run!("cargo", "run", "--release", "--bin", "runner", "-p", "day");
        std::fs::remove_file("day/temp.rs")?;
    }

    Ok(())
}
