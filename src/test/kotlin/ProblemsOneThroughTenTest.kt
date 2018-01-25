import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import java.sql.Time

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
        timer.start()

        val actualSolution = solver.multiplesOf3And5()

        timer.stop()

        assertEquals(expectedSolution, actualSolution)
    }

    // Problem ID 2
    @Test
    fun evenFibonacciNumbers() {
        val expectedSolution = 4613732
        timer.start()

        val actualSolution = solver.evenFibonacciNumbers()

        timer.stop()

        assertEquals(expectedSolution, actualSolution)
    }

}