// Task 7.7.2: phone book simulator

const val CSV_FILENAME = "phone.csv"

fun main() {
    // Implement the main program here
    // (You can add other functions to this file if you wish)
    val database = createDatabase()
    database.load(CSV_FILENAME)
    println(database)

    while (true) {
        println("Enter contact's name :")
        val contact = readln()
        if (contact == "exit"){
            break
        }
        if (contact in database.keys){
            println(database[contact])
        } else {
            println("Enter contact's number :")
            val number = readln()
            database[contact] = number
            database.save(CSV_FILENAME)
        }
    }
}
