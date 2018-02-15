
class ProblemsOneThroughTen {

    fun multiplesOf3And5(): Int {
        var total = 0

        for (value in 1..999) {
            if (value % 3 == 0 || value % 5 == 0) {
                total += value
            }
        }
        return total

    }

    fun  evenFibonacciNumbers(): Int {
        var total = 0
        var previousTerm1 = 1
        var previousTerm2 = 1
        var currentNumber = 1
        var maximum = 4000000
        while (currentNumber <= maximum) {
            if (currentNumber % 2 == 0) {
                total += currentNumber
            }
            currentNumber = previousTerm1 + previousTerm2
            previousTerm1 = previousTerm2
            previousTerm2 = currentNumber
        }
        return total
    }

    fun largestPrimeFactor(value: Long): Long {
        return primeFactors(value).last()
    }

    private fun primeFactors(value: Long): List<Long> {
        var factors = HashSet<Long>()
        val max = Math.sqrt(value.toDouble()).toLong()

        for (factor in 2..max) {
            if (value % factor == 0.toLong() && isPrime(factor)) {
                factors.add(factor)
                val otherFactor = value / factor
                if (isPrime(otherFactor)) {
                    factors.add(otherFactor)
                }
            }
        }
        return factors.sorted()
    }

    private fun isPrime(value: Long): Boolean {
        val max = Math.sqrt(value.toDouble()).toLong()
        for (factor in 2..max) {
            if (value % factor == 0.toLong()) {
                return false
            }
        }
        return true

    }

    fun largestPalindromeProduct(): Long {
        var largestPalindrome: Long = 0
        for (a in 1..999) {
            for (b in 1..999) {
                val product: Long = a.toLong() * b.toLong()
                if (isPalindrome(product)) {
                    if (product > largestPalindrome) {
                        largestPalindrome = product
                    }
                }
            }
        }
        return largestPalindrome
    }

    private fun isPalindrome(value: Long): Boolean {
        val stringValue = value.toString()
        val reverseValue = stringValue.reversed()
        return stringValue == reverseValue
    }

}