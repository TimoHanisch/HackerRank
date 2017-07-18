package Warmup.SolveMeFirst

/**
 * Created on 18.07.2017.
 * @author Timo Hanisch
 */
import java.util.*

fun solveMeFirst(a: Int, b: Int): Int {
    return b + a
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val sum = solveMeFirst(num1, num2)
    println(sum)
}
