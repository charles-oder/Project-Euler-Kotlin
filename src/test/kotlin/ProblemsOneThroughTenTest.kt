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

    // Problem ID 8
    @Test
    fun largestProductInASeries() {
        val expectedSolution: Long = 23514624000
        val series = "73167176531330624919225119674426574742355349194934" +
                "96983520312774506326239578318016984801869478851843" +
                "85861560789112949495459501737958331952853208805511" +
                "12540698747158523863050715693290963295227443043557" +
                "66896648950445244523161731856403098711121722383113" +
                "62229893423380308135336276614282806444486645238749" +
                "30358907296290491560440772390713810515859307960866" +
                "70172427121883998797908792274921901699720888093776" +
                "65727333001053367881220235421809751254540594752243" +
                "52584907711670556013604839586446706324415722155397" +
                "53697817977846174064955149290862569321978468622482" +
                "83972241375657056057490261407972968652414535100474" +
                "82166370484403199890008895243450658541227588666881" +
                "16427171479924442928230863465674813919123162824586" +
                "17866458359124566529476545682848912883142607690042" +
                "24219022671055626321111109370544217506941658960408" +
                "07198403850962455444362981230987879927244284909188" +
                "84580156166097919133875499200524063689912560717606" +
                "05886116467109405077541002256983155200055935729725" +
                "71636269561882670428252483600823257530420752963450"

        var actualValue: Long = 0
        timer.performTimedTask(10, {
            actualValue = solver.largestSeriesProduct(13, series)
        })


        assertEquals(expectedSolution, actualValue)

    }

    // Problem ID 9
    @Test
    fun specialPythagoreanTriplet() {
        val expectedSolution: Long = 31875000

        var actualValue: Long = 0
        timer.performTimedTask(10, {
            actualValue = solver.specialPythagoreanTriplet(1000)
        })


        assertEquals(expectedSolution, actualValue)

    }

    // Problem ID 10
    @Test
    fun summationOfPrimes() {
        val expectedSolution: Long = 142913828922

        var actualValue: Long = 0
        timer.performTimedTask(10, {
            actualValue = solver.summationOfPrimes(2000000)
        })

        assertEquals(expectedSolution, actualValue)

    }

    // Problem ID 10 alternate solution
    @Test
    fun summationOfPrimesUsingBruteForce() {
        val expectedSolution: Long = 142913828922

        var actualValue: Long = 0
        timer.performTimedTask(10, {
            actualValue = solver.summationOfPrimesBruteForce(2000000)
        })

        assertEquals(expectedSolution, actualValue)

    }



}