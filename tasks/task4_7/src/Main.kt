// Task 4.7: finding the longest line in a file
import kotlin.io.path.Path
import kotlin.io.path.useLines
import kotlin.io.path.writer


fun main() {
    val filePath = Path("test.txt")
    val maxValue = 4
    filePath.writer().use {
        for (number in 1..maxValue) {
            it.write(readln() + "\n")
        }
    }
    var maxLength = 0
    var maxLine = 0
    var curLine = 1
    filePath.useLines {
        for (line in it) {
            if (line.length > maxLength){
                maxLength = line.length
                maxLine = curLine
            }
            curLine++
        }
    }
    println("Line $maxLine is the longest (length = $maxLength)")
}