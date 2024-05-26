package org.example.less_6

/*
The simple timer
 */
fun main() {
    println("Введите количество секунд:")
    var secTimer = readln().toInt()
    while (secTimer > 0) {
        println("Осталось: ${secTimer--} секунд")
        Thread.sleep(1000)
    }
    println("Время вышло")
}