import kotlin.io.path.Path
import kotlin.io.path.exists
import kotlin.io.path.readLines
import kotlin.io.path.readText
import kotlin.system.exitProcess

private fun dayToPath(day: Int) = Path("inputs", "${day.toString().padStart(2, '0')}.txt")
    .also { if (!it.exists()) println("Warning: the input for day $day does not exist!") }

private inline fun <T> tryReadInput(block: () -> T) = runCatching(block)
    .onFailure { println("Failed reading your puzzle input: $it") }
    .getOrElse { exitProcess(1) }

// Reads the input as a large string of text
fun readInput(day: Int) = tryReadInput { dayToPath(day).readText() }

// Reads the input as a list of strings, where each element of the list is a single line of the input file
fun readInputLines(day: Int) = tryReadInput { dayToPath(day).readLines() }