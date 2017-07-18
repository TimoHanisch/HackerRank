package Warmup.CompareTheTriplets

/**
 * Created on 18.07.2017.
 * @author Timo Hanisch
 */
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val firstTriplet = sc.nextLine().split(delimiters = " ", limit = 3).map { it.toInt() }
    val secondTriplet = sc.nextLine().split(delimiters = " ", limit = 3).map { it.toInt() }
    val (first, second) = firstTriplet.zip(secondTriplet, { a, b ->
        if (a > b)
            Pair(1, 0)
        else if (b > a)
            Pair(0, 1)
        else
            Pair(0, 0)
    }).reduce({ (aFirst, bFirst), (aSecond, bSecond) -> Pair(aFirst + aSecond, bFirst + bSecond) })
    println("$first $second")
}
