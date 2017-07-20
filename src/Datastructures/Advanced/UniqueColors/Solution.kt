package Datastructures.Advanced.UniqueColors

import java.io.FileInputStream
import java.util.*

/**
 * TODO: Improve performance for large input @ see input.txt for this exercise
 *
 * Created on 20.07.2017.
 * @author Timo Hanisch
 */
data class Node(val id: Int, val color: Int, var adjacent: List<Node>)

fun checkTestInput(args: Array<String>) {
    if (args.isNotEmpty()) {
        System.setIn(FileInputStream(args[0]))
    }
}

fun bfs(from: Node, to: Node): List<Node> {
    val queue = LinkedList(listOf(listOf(from)))
    while (queue.isNotEmpty()) {
        val path = queue.pop()
        val node = path[path.size - 1]
        if (node == to) {
            return path
        }
        node.adjacent.forEach { child ->
            val newPath = path.plus(child)
            queue.add(newPath)
        }
    }
    return emptyList()
}

fun colorDelta(from: Node, to: Node): Int = bfs(from, to).map { it.color }.distinct().count()

fun initializeGraph(nodeCount: Int): List<Node> {
    val graph = readLine()!!.split(" ").mapIndexed { index, color -> Node(index, color.toInt(), emptyList<Node>()) }
    repeat(nodeCount - 1) {
        val (from, to) = readLine()!!.split(" ").map { it.toInt() }
        val fromNode = graph[from - 1]
        val toNode = graph[to - 1]
        fromNode.adjacent = fromNode.adjacent.plus(toNode)
        toNode.adjacent = toNode.adjacent.plus(fromNode)
    }
    return graph
}

fun main(args: Array<String>) {
    checkTestInput(args)
    val nodeCount = readLine()!!.toInt()
    val graph = initializeGraph(nodeCount)
    graph.forEach { node ->
        val deltaSum = (0..(nodeCount - 1)).map { index ->
            colorDelta(node, graph[index])
        }.sum()
        println(deltaSum)
    }
}
