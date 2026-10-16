// Task 6.5: unit tests for grade()

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import kotlin.test.Test


@Suppress("unused")
class GradeTest : FreeSpec({
    // Write your tests in here
    @Test
    fun testForNegative() {
        grade(-55) shouldBe "?"
    }
    @Test
    fun testForNegativeLess() {
        grade(-1) shouldBe "?"
    }
    @Test
    fun testForZero() {
        grade(0) shouldBe "Fail"
    }
    @Test
    fun testForFail() {
        grade(20) shouldBe "Fail"
    }
    @Test
    fun testForFailing() {
        grade(39) shouldBe "Fail"
    }
    @Test
    fun testForPassingGrade() {
        grade(40) shouldBe "Pass"
    }
    @Test
    fun testForPass() {
        grade(55) shouldBe "Pass"
    }
    @Test
    fun testForAlmostDistinction() {
        grade(69) shouldBe "Pass"
    }
    @Test
    fun testForError() {
        grade(70) shouldBe "Distinction"
    }
    @Test
    fun testForDistinction() {
        grade(90) shouldBe "Distinction"
    }
    @Test
    fun testForHundred() {
        grade(100) shouldBe "Distinction"
    }
    @Test
    fun testForOverhundred() {
        grade(101) shouldBe "?"
    }
    @Test
    fun testForOver() {
        grade(153) shouldBe "?"
    }
})
