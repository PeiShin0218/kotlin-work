// Task 13.4: unit tests for Money class

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class MoneyTest : FreeSpec({
    // Write your unit tests here

    "Can create a Money" {
        val m = Money(1, 50)
    }

    "Can create a Money" {
        val m = Money(1, 50)
        withClue("euros") { m.euros shouldBe 1 }
        withClue("cents") { m.cents shouldBe 50 }
    }

    "Can create a different Money" {
        val m = Money(2, 99)
        withClue("euros") { m.euros shouldBe 2 }
        withClue("cents") { m.cents shouldBe 99 }
    }

    "Exception when creating Money with negative euros" {
        shouldThrow<IllegalArgumentException> {
            Money(-1, 0)
        }
    }

    "Exception when creating Money with negative cents" {
        shouldThrow<IllegalArgumentException> {
            Money(0, -1)
        }
    }

    "Exception when creating Money with more than 100 cents" {
        shouldThrow<IllegalArgumentException> {
            Money(0, 100)
        }
    }

    "€1.50 + €1.00 is €2.50" {
        Money(1, 50) + Money(1, 0) shouldBe Money(2, 50) 
    }

    "€1.50 + €2.00 is €3.50" {
        Money(1, 50) + Money(2, 0) shouldBe Money(3, 50)
    }

    "€1.50 + €0.01 is €1.51" {
        Money(1, 50) + Money(0, 1) shouldBe Money(1, 51)
    }

    "€2.99 + €0.01 is €3.00" {
        Money(2, 99) + Money(0, 1) shouldBe Money(3, 0)
    }

    "Printing €1.10" {
        Money(1, 10).toString() shouldBe "€1.10"
    }

    "Printing €1.05" {
        Money(1, 5).toString() shouldBe "€1.05"
    }

    "More than true"{
        (Money(5, 0) > Money(2, 99)) shouldBe true
    }

    "More than false"{
        (Money(5, 0) > Money(5, 0)) shouldBe false
    }

    "Less than true"{
        (Money(1, 50) < Money(1, 75)) shouldBe true
    }

    "Less than false"{
        (Money(1, 50) < Money(1, 25)) shouldBe false
    }

    "More than or equal to"{
        (Money(5, 0) >= Money(5, 0)) shouldBe true
    }

    "Less than or equal to"{
        (Money(1, 50) <= Money(2, 50)) shouldBe true
    }

    "Equal to"{
        (Money(1, 50) == Money(1, 50)) shouldBe true
    }

    "Not equal to"{
        (Money(1, 50) != Money(2, 50)) shouldBe true
    }

    "Exception when money turn negative" {
        shouldThrow<IllegalArgumentException> {
            Money(0, 30) - Money(0, 50)
        }
    }

    "€1.50 - €1.00 is €0.50" {
        Money(1, 50) - Money(1, 0) shouldBe Money(0, 50) 
    }

    "€1.50 - €0.70 is €0.80" {
        Money(1, 50) - Money(0, 70) shouldBe Money(0, 80)
    }

    "€10.50 - €5.60 is €4.90" {
        Money(10, 50) - Money(5, 60) shouldBe Money(4, 90)
    }

})
