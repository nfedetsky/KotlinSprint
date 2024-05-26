package org.example.less_6
/*
Counter
 */

fun main() {

    println("Введите количество секунд:")
    var secTimer = readln().toInt() * 1000
    Thread.sleep(secTimer.toLong())
    println("Прошло: ${secTimer/1000} секунд")
    Thread.sleep(10000000)

}