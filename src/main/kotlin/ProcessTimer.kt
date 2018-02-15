
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
}