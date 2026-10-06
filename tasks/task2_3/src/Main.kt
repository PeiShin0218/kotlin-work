// Task 2.3

fun main() {
    val myAge = 29u //UInt Correct
    val universeAge = 13_800_000_000L //ULong Wrong Correction : Long
    val status = 'M' //Char Correct
    val name = "Sarah" //String Correct
    val height = 1.78f //Float Correct
    val root2 = Math.sqrt(2.0) //Double Correct
    
    println(myAge::class)
    println(universeAge::class)
    println(status::class)
    println(name::class)
    println(height::class)
    println(root2::class)
}
