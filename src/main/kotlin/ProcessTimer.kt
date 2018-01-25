
public class ProcessTimer {

    private var startTime: Long = 0

    public fun start(): Unit {
        startTime = System.nanoTime()
    }

    public fun stop(): Unit {
        val endTime = System.nanoTime()
        val duration = endTime - startTime
        var milisecondsValue = duration.toDouble() / 1000000.0

        val millisecondString = String.format("%.6f", milisecondsValue)
        println("Process took $millisecondString miliseconds")
    }
}