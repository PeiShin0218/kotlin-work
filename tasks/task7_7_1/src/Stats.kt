// Task 7.7.1: statistics functions

fun median(list: List<Float>): Float{
    val sortedList = list.sorted()
    if ((sortedList.size) % 2 == 0) {
        val a = sortedList.size / 2
        val b = a - 1
        return ((sortedList[a] + sortedList[b]) / 2)
    } else {
        val c = sortedList.size / 2
        return sortedList[c]
    }
}

fun displayStats(list: List<Float>){
    println("Max = " + list.max())
    println("Min = " + list.min())
    println("Mean = " + list.average())
    println("Median = " + median(list))
}