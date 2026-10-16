// Task 5.3.2: rollDice() function
import kotlin.random.Random

fun rollDie(sides: Int = 6, diceNum: Int = 1) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        for (n in 1..diceNum) {
            println("Rolling a d$sides...")
            val result = Random.nextInt(1, sides + 1)
            println("You rolled $result")
        }
    } else {
        println("Error: cannot have a $sides-sided die")
    }
}