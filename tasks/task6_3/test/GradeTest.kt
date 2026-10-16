// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    // Write tests here
    @Test
    fun `Mark of 55 gives a Pass`() {
        assertEquals("Pass", grade(55))
    }

    @Test
    fun testForNegative() {
        assertEquals("?", grade(-55))
    }
    @Test
     fun testForNegativeLess() {
        assertEquals("?", grade(-1))
    }
    @Test
    fun testForZero() {
        assertEquals("Fail", grade(0))
    }
    @Test
    fun testForFail() {
        assertEquals("Fail", grade(20))
    }
    @Test
    fun testForFailing() {
        assertEquals("Fail", grade(39))
    }
    @Test
    fun testForPassingGrade() {
        assertEquals("Pass", grade(40))
    }
    @Test
    fun testForPass() {
        assertEquals("Pass", grade(55))
    }
    @Test
    fun testForAlmostDistinction() {
        assertEquals("Pass", grade(69))
    }
    @Test
    fun testForError() {
        assertEquals("Distinction", grade(70))
    }
    @Test
    fun testForDistinction() {
        assertEquals("Distinction", grade(90))
    }
    @Test
    fun testForHundred() {
        assertEquals("Distinction", grade(100))
    }
    @Test
    fun testForOverhundred() {
        assertEquals("?", grade(101))
    }
    @Test
    fun testForOver() {
        assertEquals("?", grade(153))
    }
}
