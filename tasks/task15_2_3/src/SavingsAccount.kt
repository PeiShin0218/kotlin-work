// Task 15.2.3: SavingsAccount class
class SavingsAccount(holder: String, val rate: Double) : BankAccount(holder) {
    init{
        require(rate > 0) {" Failed. Interest rate should not be less than zero. "}
    }

    fun applyInterest(){
        val interest = balance * rate / 100
        deposit(interest.toInt())
    }
}