// Task 9.6: readData() function
import kotlin.io.path.Path
import kotlin.io.path.forEachLine

fun readData(filename: String) = buildList {
    Path(filename).forEachLine {
        require(it.toDoubleOrNull() != null) { "not a double" }
        add(it.toDouble())
    }
}