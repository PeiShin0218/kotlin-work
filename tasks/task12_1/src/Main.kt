// Task 12.1: program that uses a Point object
fun main(args: Array<String>) {
    val p = Point(4.0, 3.0)
    println(p.x)
    println(p.y)
    val origin = Point(0.0, 0.0)
    println(p.distanceTo(origin))
    println(p.distanceTo(Point(4.5, 7.0)))
}