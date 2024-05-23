package org.example.less_5
import kotlin.random.Random

/*
The happy lottery advanced
 */
fun main(){

    var userData: List<Int>
    var generatedData: List<Int>

    //User input block
    println("Input the first number: ")
    userData = listOf(readln().toInt())
    println("Input the second number: ")
    userData = userData + listOf(readln().toInt())
    println("Input the third number: ")
    userData = userData + listOf(readln().toInt())

    //Machine generation block
    generatedData = listOf(Random.nextInt(from = 0, until = 43))
    generatedData = generatedData + listOf(Random.nextInt(from = 0, until = 43))
    generatedData = generatedData + listOf(Random.nextInt(from = 0, until = 43))

    //Array comparison
    val intersectArray = generatedData.intersect(userData)

    //Calculation of the winner
    val comparisonResult = if(intersectArray.size == 3) "You winner!"
    else if (intersectArray.size == 2) "You win two of three numbers and get a massive prize!"
    else if (intersectArray.size == 1) "You win one of three numbers and get an incentive prize!"
    else "Well... You are loser! There are no any words."

    println("Numbers entered by the player: $userData \n")
    println("Numbers entered by the computer: $generatedData \n")
    println("Winning numbers: $intersectArray \n")
    println(comparisonResult)
}

