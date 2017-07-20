package Datastructures.Arrays.AlgorithmicCrush

import java.util.*

/**
 * Created on 19.07.2017.
 *
 * @author Timo Hanisch
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val (n, m) = sc.nextLine().split(" ").map { it.toInt() }
    val array = LongArray(n + 1, { 0 })
    repeat(m) {
        val (a, b, k) = sc.nextLine().split(" ").map { it.toInt() }
        array[a] = array[a] + k
        if (b + 1 <= n) {
            array[b + 1] = array[b + 1] - k
        }
    }
    var tmpMax = 0L
    var max = 0L
    array.forEach {
        tmpMax += it
        if (tmpMax > max) {
            max = tmpMax
        }
    }
    println(max)
}
