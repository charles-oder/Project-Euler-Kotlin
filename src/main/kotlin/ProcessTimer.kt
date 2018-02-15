
public class ProcessTimer {

    private var startTime: Long = 0

    public fun start() {
        startTime = System.nanoTime()
    }

    public fun stop(): Double {
        val endTime = System.nanoTime()
        val duration = endTime - startTime
        var milisecondsValue = duration.toDouble() / 1000000.0

        return milisecondsValue
    }

    fun performTimedTask(iterations: Int, block: () -> Unit) {
        start()
        for (i in 1..iterations) {
            block()
        }
        val time = stop()
        val timePerIteration = time / iterations.toDouble()

        val millisecondString = String.format("%.6f", timePerIteration)
        println("$iterations iterations took $time ms")
        println("Process took an average of $millisecondString ms")

    }
}