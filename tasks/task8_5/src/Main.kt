// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    val text = readln()
    val vowelCount = text.howMany { it.lowercase() in "aeiou" }
    val testCount1 = text.count{ it.lowercase() in "aeiou" }
    val test1 = "Chocolate Mocha".howMany{ it.lowercase() in "abcde"}
    val testCount2 = "Chocolate Mocha".count{ it.lowercase() in "abcde"}
    println("$vowelCount vowels found")
    println(testCount1)
    println(test1)
    println(testCount2)
}
