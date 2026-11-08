// Task 12.8.1: demo program for Day enum class
import Day.*
fun main(args: Array<String>) {
    println("Enter day:")
    val userDay = readln()
    try {
        val day = Day.valueOf(userDay)
        println(day)
    }
    catch(error: IllegalArgumentException) {
        println("You can only enter Monday, Tuesday, Wednesday, Thursday, Friday, Saturday and Sunday.")
    }
}