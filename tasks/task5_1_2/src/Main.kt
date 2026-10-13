// Task 5.1.2: main program
fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Enter one number in 'Program arguments' field")
        return
    } else {
        rollDie(args[0].toInt())
    }
}