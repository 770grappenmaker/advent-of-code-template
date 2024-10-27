// Contains some code to simplify the coding process for a given day
// If you don't get how this works, it is perfectly fine to choose not to use it
class PuzzleContext(val day: Int) {
    init {
        check(day in 1..25) { "Day $day is not between 1 and 25!" }
    }

    val input by lazy { readInput(day) }
    val inputLines by lazy { readInputLines(day) }
    var partOne: Any = "Not solved yet"
    var partTwo: Any = "Not solved yet"
}

inline fun puzzle(day: Int, block: PuzzleContext.() -> Unit) {
    println("Advent of Code 2024, Day $day")
    val ctx = PuzzleContext(day)
    ctx.block()

    println("Part 1 answer: ${ctx.partOne}")
    println("Part 2 answer: ${ctx.partTwo}")
}
