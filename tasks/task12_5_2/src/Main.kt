// Task 12.5.2: demo program for class with custom getter
import kotlinx.datetime.LocalDate

fun main(args: Array<String>) {
    val p = Person("Joe", birth=LocalDate(1992, 8, 23))

    println(p.name)
}