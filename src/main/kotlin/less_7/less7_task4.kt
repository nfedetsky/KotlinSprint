package org.example.less_7
/*
The timer second
 */
fun main() {

    println("Input Your number:")
    var userNumber = readln().toInt()

    for (i in userNumber downTo 0) {
        Thread.sleep(1000)
        println("$i sec. left to finish")
    }
    println("Time is up")
}