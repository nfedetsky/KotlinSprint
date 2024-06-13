package org.example.less_7
/*
The even progressions
 */
fun main() {

    println("Input Your some number:")
    val userNumber = readln().toInt()
    val progressionSeries: IntProgression

    if (userNumber < 0) {
        progressionSeries = 0 downTo userNumber
        println(progressionSeries.filter { it % 2 == 0 }.joinToString())
    } else if (userNumber > 0) {
        progressionSeries = 0..userNumber
        println(progressionSeries.filter { it % 2 == 0 }.joinToString())
    } else println("The task has no solution")
}