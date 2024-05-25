package org.example.less_6
/*
Counter
 */

fun main() {

    println("Введите количество секунд:")
    var secTimer = readln().toInt()
    var shild = 0
        while (secTimer > 0) {
        secTimer--
        shild++
        print("===")
        Thread.sleep(1000)
    }
    println()
    println("Прошло: $shild секунд")
    Thread.sleep(10000000)

}