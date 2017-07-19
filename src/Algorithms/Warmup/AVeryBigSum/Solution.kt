package Algorithms.Warmup.AVeryBigSum

/**
 * Created on 18.07.2017.
 * @author Timo Hanisch
 */
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val numCount = sc.nextLine().toInt()
    val array = sc.nextLine()
            .split(delimiters = " ", limit = numCount)
            .map { it.toLong() }
            .sum()
    println(array)
}
