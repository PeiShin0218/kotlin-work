// Task 12.4.1: main program
fun main(args: Array<String>) {
    val origin = Point(0.0, 0.0)
    val cir = Circle(origin, 5.0)
    val a = Point(1.0, 2.0)
    val b = Point(7.0, 9.0)
    println(cir.perimeter())
    println(cir.area())
    println("is a in the circle? ${cir.contains(a)}")
    println("is b in the circle? ${cir.contains(b)}")
}