// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main(args: Array<String>) {
    val birthDate = LocalDate(1997, 8, 23)
    val marriedPerson = Person("Joe", birthDate).apply {
        isMarried = true
    }
    val someone = Person("Kirumi", "2016-05-04").apply {
        isMarried = false
    }
    println("${marriedPerson.name}, ${marriedPerson.birth}, Married: ${marriedPerson.isMarried}")
    println("${someone.name}, ${someone.birth}, Married: ${someone.isMarried}")
}