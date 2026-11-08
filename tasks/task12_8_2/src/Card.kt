// Task 12.8.2: class to represent playing cards
import Rank.*
import Suit.*

class Card(val rank: Rank, val suit: Suit){
    val fullName = "${rank.name} of ${suit.name}"

    override fun toString() = "${rank.symbol}${suit.symbol}"
}