package Algorithms.Warmup.PlusMinus

/**
 * Created on 18.07.2017.
 * @author Timo Hanisch
 */
import java.util.*

fun format(value: Float): String {
    return "%.6f".format(value)
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val numCount = sc.nextLine().toInt()
    var zeroCount = 0F
    var positiveCount = 0F
    var negativeCount = 0F
    sc.nextLine()
            .split(delimiters = " ", limit = numCount)
            .map { it.toInt() }
            .forEach { if (it > 0) positiveCount++ else if (it < 0) negativeCount++ else zeroCount++ }
    println(format(positiveCount / numCount))
    println(format(negativeCount / numCount))
    println(format(zeroCount / numCount))
}
