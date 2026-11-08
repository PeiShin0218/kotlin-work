// Task 13.4: Money class
data class Money(val euros: Int, val cents: Int) : Comparable<Money> {
    init {
        require(euros >= 0) { "Euros cannot be negative" }
        require(cents >= 0) { "Cents cannot be negative" }
        require(cents <= 99) { "Cents cannot be higher than 99" }
    }

    operator fun plus(other: Money) = Money(euros + other.euros + ((cents + other.cents)/100), (cents + other.cents) % 100)

    override fun toString() = "€$euros.${"%02d".format(cents)}"

    override fun compareTo(other: Money): Int {
        val thisTotal = euros * 100 + cents
        val otherTotal = other.euros * 100 + other.cents
        return thisTotal.compareTo(otherTotal)
    }

    operator fun minus(other: Money): Money {
        val thisTotal = euros * 100 + cents
        val otherTotal = other.euros * 100 + other.cents
        val result = thisTotal - otherTotal
        require(result > 0) { "Money cannot be negative" }
        return Money(result / 100, result % 100)
    }
}