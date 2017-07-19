package Datastructures.Arrays.AlgorithmicCrush

import java.util.*

/**
 * Created on 19.07.2017.
 *
 * TODO: Performance!
 *
 * @author Timo Hanisch
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val (n, m) = sc.nextLine().split(" ").map { it.toInt() }
    val array = LongArray(n, { _ -> 0 })
    repeat(m) {
        val (a, b, k) = sc.nextLine().split(" ").map { it.toInt() }
        ((a - 1)..(b - 1)).forEach { i ->
            array[i] = array[i] + k
        }
    }
    println(array.max())
}
