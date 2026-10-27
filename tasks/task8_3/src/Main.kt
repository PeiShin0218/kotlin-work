// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1) {
        println("Enter the filename")
        return
    } else {
        val record = fetchData(args[0])

        val lowest = record.minBy { it.second }
        val highest = record.maxBy { it.second }
        val lowestStation = lowest.first
        val lowestTemp = lowest.second
        val highestStation = highest.first
        val highestTemp = highest.second
        println("Lowest temperature is $lowestTemp, the station is $lowestStation")
        println("Highest temperature is $highestTemp, the station is $highestStation")
        println()

        //val average = averageTemp(record)
        val average = record.map{it.second}.average()
        System.out.printf("Average temperature is %.2f \n", average)
    }
}
