package Warmup.MiniMaxSum

/**
 * Created on 18.07.2017.
 * @author Timo Hanisch
 */
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val limit = 5
    var min = Long.MAX_VALUE
    var max: Long = 0
    val array = sc.nextLine()
            .split(delimiters = " ", limit = limit)
            .map { it.toLong() }
    (0..(limit - 1)).forEach {
        val sum = array.filterIndexed { i, _ -> it != i }.sum()
        if (sum < min) min = sum
        if (sum > max) max = sum
    }
    println("$min $max")
}
