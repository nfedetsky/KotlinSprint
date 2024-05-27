package org.example.less_6

import kotlin.random.Random

/*
The funny game
 */

fun main() {
    val hiddenNumber = Random.nextInt(1, 10)
    var counter = 5
    val userTries = mapOf(5 to "first", 4 to "second", 3 to "third", 2 to "fourth", 1 to "fifth")
    val userIndexOfTries = mapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four")
    println("Let's play my game. I think of a number from one to nine and You have to guess it.")
    println("You have five tries.")
    println("Let the game begin!")
    do {
        println("The ${userTries[counter]} try")
        counter--
        println("Input Your variant: ")
        var userVar = readln().toInt()
        if (userVar == hiddenNumber) {
            println("Congratulations! It was a great game!")
            break
        } else println("Your try was not successful. You have ${userIndexOfTries[counter]} tries")
    } while (counter > 0)

    println("I have thought number $hiddenNumber")
    println("Game over!")
}