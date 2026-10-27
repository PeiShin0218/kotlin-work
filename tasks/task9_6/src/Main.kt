// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess
import java.nio.file.NoSuchFileException

fun main(args: Array<String>) {
    // Implement main program here
    try {
    val filename = args[0]
    val dataset = readData(filename)
    val v = variance(dataset)
    println("The size of dataset is " + dataset.size)
    println("The variance of dataset is %.5f".format(v))
    
    } catch (error: ArrayIndexOutOfBoundsException) {
        println("File name not provided")
    } catch (error: IllegalArgumentException) {
        println("Error in file")
    } catch (error: NoSuchFileException) {
        println("No such file exist")
    } catch (error: NumberFormatException) {
        println("File contain words")
    }catch (error: Exception) {
        println("Some sort of error occurred")
    } 
}
