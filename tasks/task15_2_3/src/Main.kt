// Task 15.2.3: demo program

fun main() {
    // Write code to demonstrate the classes here
    val savingAccount = SavingsAccount("Oma", 1.8)
    savingAccount.deposit(1250)
    println(savingAccount.balance)
    for (x in 1..5){
        savingAccount.applyInterest()
        println(savingAccount.balance)
    }
    savingAccount.withdraw(50)
    println(savingAccount.balance)
}
