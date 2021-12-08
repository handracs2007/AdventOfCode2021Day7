import java.io.File
import kotlin.math.abs

fun solvePart1(positions: List<Int>) {
    // Create the target positions.
    val targets = (1..positions.maxOrNull()!!)

    // Calculate the total cost.
    val cost = targets.minOfOrNull { target -> positions.sumOf { abs(it - target) } }

    println("PART 1 ANSWER")
    println(cost)
}

fun solvePart2(positions: List<Int>) {
    // Create the target positions.
    val targets = (1..positions.maxOrNull()!!)

    // Calculate the total cost.
    val cost = targets.minOfOrNull { target -> positions.sumOf { (1..abs(it - target)).sum() } }

    println("PART 2 ANSWER")
    println(cost)
}

fun main() {
    val positions = File("input.txt").readText().split(",").map { it.toInt() }

    solvePart1(positions)
    solvePart2(positions)
}