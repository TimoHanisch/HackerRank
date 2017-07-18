package Warmup.DiagonalDifference

/**
 * Created on 18.07.2017.
 * @author Timo Hanisch
 */
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val matrixSize = sc.nextLine().toInt()
    var firstDiagonal = 0
    var secondDiagonal = 0
    repeat(matrixSize) { i ->
        val matrixRow = sc.nextLine()
                .split(delimiters = " ", limit = matrixSize)
                .map { it.toInt() }
        firstDiagonal += matrixRow[i]
        secondDiagonal += matrixRow[(matrixSize - 1) - i]
    }
    println(Math.abs(firstDiagonal - secondDiagonal))
}
