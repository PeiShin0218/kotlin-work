import kotlinx.datetime.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false
    constructor(name: String, birth: String) : this(name, LocalDate.parse(birth))
    init {
        require(name.isNotBlank()) { "Name cannot be blank" }
    }
}