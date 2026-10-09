// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: integer required on command line")
        exitProcess(1)
    } else {
        val avg = ((args[0].toDouble() + args[1].toDouble() + args[2].toDouble())/3).roundToInt()
        val grade = when (avg) {
            in 0..39   -> "Fail"
            in 40..69  -> "Pass"
            in 70..100 -> "Distinction"
            else       -> "?"
        }
        println(grade)
    }
}