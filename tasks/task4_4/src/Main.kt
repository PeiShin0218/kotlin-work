// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    val initial = args[0].toFloat()
    val max = args[1].toFloat()
    val increment = args[2].toFloat()
    var celsius = initial
    println("Celsius    Fahrenheit")

    while (celsius <= max){
        val fahrenheit = (celsius * 9/5) + 32
        //Option 1
        println("%5.1f %12.1f".format(celsius, fahrenheit))
        celsius += increment
    }

}
