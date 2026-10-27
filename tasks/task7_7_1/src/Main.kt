// Task 7.7.1: program to compute stats for a numeric dataset
import kotlin.io.path.Path
import kotlin.io.path.readLines

fun main(args: Array<String>) {
    val testList = readData("test.txt")
    println (testList)
    displayStats(testList)
}