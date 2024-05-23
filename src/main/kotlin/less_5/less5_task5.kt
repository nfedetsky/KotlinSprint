package org.example.less_5

import kotlin.random.Random

/*
The happy lottery advanced
 */
fun main() {

    val userData = mutableSetOf<Int>()
    val generatedData = mutableSetOf<Int>()

    //User input block
    println("Input the first number: ")
    userData.add(readln().toInt())
    println("Input the second number: ")
    userData.add(readln().toInt())
    println("Input the third number: ")
    userData.add(readln().toInt())

    //Machine generation block
    generatedData.add(Random.nextInt(from = 0, until = 43))
    generatedData.add(Random.nextInt(from = 0, until = 43))
    generatedData.add(Random.nextInt(from = 0, until = 43))

    //Array comparison
    val intersectArray = generatedData.intersect(userData)

    println("Numbers entered by the player: $userData \n")
    println("Numbers entered by the computer: $generatedData \n")
    println("Winning numbers: $intersectArray \n")

    //Calculation of the winner
    when {
        intersectArray.size == 3 -> println("Congratulation! You win three of three numbers! You are winner!")
        intersectArray.size == 2 -> println("You win two of three numbers and get a massive prize!")
        intersectArray.size == 1 -> println("You win one of three numbers and get an incentive prize!")
        else -> println("Well... You are loser! There are no any words.")
    }
}

