import org.junit.Test

import org.junit.Assert.*
import java.sql.Time

class ProblemsOneThroughTenTest {

    // Problem ID 1
    @Test
    fun multiplesOf3And5() {
        val solver = ProblemsOneThroughTen()
        val timer = ProcessTimer()
        val expectedSolution = 233168
        timer.start()

        val actualSolution = solver.multiplesOf3And5()

        timer.stop()

        assertEquals(expectedSolution, actualSolution)
    }

}