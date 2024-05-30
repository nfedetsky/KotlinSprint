package org.example.less_6

import kotlin.random.Random

/*
The bot verification
 */

fun main() {
    var userLogin = "admin"
    var userPass = "admin"
    var userInputLogin: String
    var userInputPass: String

    println("For verify solve the example")

    //Bot verification block

    do {
        val arg1 = Random.nextInt(1, 100)
        val arg2 = Random.nextInt(1, 100)
        val mashinRez = arg1 + arg2
        println("Input your answer for this example: $arg1 + $arg2:")
        val userRez = readln().toInt()
        if (userRez == mashinRez) println("Verify successful")
        else println("Verify failed. Try again.")
    } while (userRez != mashinRez)

    //Authorization block
    println("Please log in to the system")

    do {
        println("Input your login: ")
        userInputLogin = readln()
        println("Input your password: ")
        userInputPass = readln()
        if (userInputLogin != userLogin || userInputPass != userPass) println("Authorization failed. Try again")
    } while (userInputLogin != userLogin || userInputPass != userPass)

    println("Authorization successful")
}