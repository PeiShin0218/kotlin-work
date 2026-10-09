// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    print("PIZZA MENU \n \n(a) Margherita\n(b) Quattro Stagioni\n(c) Seafood\n(d) Hawaiian\n \nChoose your pizza (a-d): ")
    val pizza_option = readln().lowercase()
    if (pizza_option.length == 1 && pizza_option[0] in 'a'..'d') {
        println("Order accepted")
    } else {
        println("Invalid choice!")
    }
}
