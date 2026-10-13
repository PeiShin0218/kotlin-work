// Task 5.2.1: main program
fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Enter one number in 'Program arguments' field")
        return
    } else {
        val radius = args[0].toDouble()
        System.out.printf("Area = %.4f\n", circleArea(radius))
        System.out.printf("Perimeter = %.4f\n",circlePerimeter(radius))
    }
}