package Warmup.Staircase

/**
 * Created on 18.07.2017.
 * @author Timo Hanisch
 */
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val numCount = sc.nextLine().toInt()
    repeat(numCount) { i ->
        println("${" ".repeat((numCount - 1) - i)}${"#".repeat(i + 1)}")
    }
}
