package Algorithms.Implementation.GradingStudents

import java.util.*

/**
 * Created on 19.07.2017.
 * @author Timo Hanisch
 */

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val numCount = sc.nextLine().toInt()
    repeat(numCount) {
        val num = sc.nextLine().toInt()
        if (num < 38 || num % 5 < 3) {
            println(num)
        } else {
            val rest = num % 5
            println(num + (5 - rest))
        }
    }
}
