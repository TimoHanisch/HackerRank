package Algorithms.Warmup.TimeConversion

/**
 * Created on 18.07.2017.
 * @author Timo Hanisch
 */
import java.util.*

fun formatHour(hour: String?, isAm: Boolean): String? {
    return if (isAm && hour == "12") "00" else if (isAm) hour else if (hour == "12") "12" else "${hour?.toInt()?.plus(12)}"
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val timeInput = sc.nextLine()
    val regex = "(\\d{2}):(\\d{2}):(\\d{2})".toRegex()
    val time = timeInput.substring(0, timeInput.length - 2)
    val isAm = timeInput.substring(timeInput.length - 2).toLowerCase() == "am"
    val regexMatches = regex.matchEntire(time)
    val hour = regexMatches?.groupValues?.get(1)
    val minute = regexMatches?.groupValues?.get(2)
    val second = regexMatches?.groupValues?.get(3)
    val result = "${formatHour(hour, isAm)}:$minute:$second"
    println(result)
}
