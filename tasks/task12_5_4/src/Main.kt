// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate

fun main(args: Array<String>) {
    val p = Person("Joe", birth=LocalDate(1992, 8, 23))
    println(p.age)
}