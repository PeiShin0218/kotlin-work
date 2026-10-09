// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1) {
        println("Error: integer required on command line")
        exitProcess(1)
    } else {
        val limit = args[0].toInt()
        var sum = 0
        for (n in 1..limit step 2){
            sum = sum + n
        }
        println("Sum = " + sum)
    }
}
