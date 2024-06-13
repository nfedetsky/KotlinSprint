package org.example.less_7

/*
The even progressions
 */
fun main() {

    println("Input Your some number:")
    val userNumber = readln().toInt()
    val progressionSeries = (0..userNumber).step(2).joinToString()
    println("The even progression is $progressionSeries")
}