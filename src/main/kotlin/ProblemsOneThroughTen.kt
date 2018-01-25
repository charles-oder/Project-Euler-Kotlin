
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
}