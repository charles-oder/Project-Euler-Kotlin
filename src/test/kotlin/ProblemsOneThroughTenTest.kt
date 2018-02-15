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
        performTimedTask(10, {
            actualValue = solver.multiplesOf3And5()
        })


        assertEquals(expectedSolution, actualValue)
    }

    // Problem ID 2
    @Test
    fun evenFibonacciNumbers() {
        val expectedSolution = 4613732

        var actualValue = 0
        performTimedTask(10, {
            actualValue = solver.evenFibonacciNumbers()
        })


        assertEquals(expectedSolution, actualValue)
    }

    // Problem ID 3
    @Test
    fun largestPrimeFactor() {
        val expectedSolution = 6857.toLong()

        var actualValue: Long = 0
        performTimedTask(10, {
            actualValue = solver.largestPrimeFactor(600851475143)
        })


        assertEquals(expectedSolution, actualValue)
    }

    // Problem ID 4
    @Test
    fun largestPalindromeProduct() {
        val expectedSolution: Long = 906609

        var actualValue: Long = 0
        performTimedTask(10, {
            actualValue = solver.largestPalindromeProduct()
        })


        assertEquals(expectedSolution, actualValue)
    }

    fun performTimedTask(iterations: Int, block: () -> Unit) {
        timer.start()
        for (i in 1..iterations) {
            block()
        }
        val time = timer.stop()
        val timePerIteration = time / iterations.toDouble()

        val millisecondString = String.format("%.6f", timePerIteration)
        println("$iterations iterations took $time ms")
        println("Process took an average of $millisecondString ms")

    }

}