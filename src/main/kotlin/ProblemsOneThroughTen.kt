
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
}