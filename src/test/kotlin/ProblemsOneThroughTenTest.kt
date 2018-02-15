import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class ProblemsOneThroughTenTest {

    val solver = ProblemsOneThroughTen()
    val timer = ProcessTimer()

    @Before
    fun setup() {

    }

    // Problem ID 1
    @Test
    fun multiplesOf3And5() {
        val expectedSolution = 233168

        var actualValue = 0
        timer.performTimedTask(10, {
            actualValue = solver.multiplesOf3And5()
        })


        assertEquals(expectedSolution, actualValue)
    }

    // Problem ID 2
    @Test
    fun evenFibonacciNumbers() {
        val expectedSolution = 4613732

        var actualValue = 0
        timer.performTimedTask(10, {
            actualValue = solver.evenFibonacciNumbers()
        })


        assertEquals(expectedSolution, actualValue)
    }

    // Problem ID 3
    @Test
    fun largestPrimeFactor() {
        val expectedSolution = 6857.toLong()

        var actualValue: Long = 0
        timer.performTimedTask(10, {
            actualValue = solver.largestPrimeFactor(600851475143)
        })


        assertEquals(expectedSolution, actualValue)
    }

    // Problem ID 4
    @Test
    fun largestPalindromeProduct() {
        val expectedSolution: Long = 906609

        var actualValue: Long = 0
        timer.performTimedTask(10, {
            actualValue = solver.largestPalindromeProduct()
        })


        assertEquals(expectedSolution, actualValue)
    }

    // Problem ID 5
    @Test
    fun smallestMultiple() {
        val expectedSolution: Long = 232792560

        var actualValue: Long = 0
        timer.performTimedTask(10, {
            actualValue = solver.smallestMultiple()
        })


        assertEquals(expectedSolution, actualValue)

    }

    // Problem ID 6
    @Test
    fun sumSquareDifference() {
        val expectedSolution: Long = 25164150

        var actualValue: Long = 0
        timer.performTimedTask(10, {
            actualValue = solver.sumSquareDifference(100)
        })


        assertEquals(expectedSolution, actualValue)

    }

    // Problem ID 7
    @Test
    fun oneThousandAndFirstPrime() {
        val expectedSolution: Long = 104743

        var actualValue: Long = 0
        timer.performTimedTask(10, {
            actualValue = solver.nthPrime(10001)
        })


        assertEquals(expectedSolution, actualValue)

    }

}