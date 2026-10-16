// Task 5.3.2: main program
fun main(args: Array<String>) {
    /*rollDie()
    rollDie(4, 2)
    rollDie(5, 3)
    rollDie(sides=8, diceNum=1)
    rollDie(diceNum=3, sides=4)*/
    val sides = args[0].substringAfter('d').toInt()
    val diceNum = args[0].substringBefore('d').toInt()
    rollDie(sides, diceNum)
}