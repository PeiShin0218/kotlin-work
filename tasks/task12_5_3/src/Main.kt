// Task 12.5.3: demo program for class with custom setter
import kotlinx.datetime.LocalDate

fun main(args: Array<String>) {
    val p = Person("John", LocalDate(1992, 8, 23))
    p.name = ""
}

//Why it didn't show exception?