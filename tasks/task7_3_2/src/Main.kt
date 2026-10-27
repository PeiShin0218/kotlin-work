fun main(args: Array<String>) {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    println(numbers)
    /*println(numbers[0])
    //println(numbers[10])
    println(numbers.slice(2..4))
    println(numbers.first())
    println(numbers.last())*/
    numbers[0] = 1
    numbers.add(1)
    println(numbers)

    numbers.addAll(listOf(2, 3, 12, 53, 404))
    println(numbers)

    numbers.remove(2)
    println(numbers)

    numbers.removeAll(listOf(2, 3, 1))
    println(numbers)

    numbers.removeAt(3)
    println(numbers)

    numbers.clear()
    println(numbers)
}