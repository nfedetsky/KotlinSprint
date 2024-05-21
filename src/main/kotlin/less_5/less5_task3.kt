package org.example.less_5
/*
The happy lottery
 */
fun main(){

    //Lottery reference indexes
    val luckyNumberOne = 0
    val luckyNumberTwo = 42

    //Input the first number
    println(message = "Input the first number:  ")
    val inputLuckyNumberOne = readln().toInt()

    //Input the second number
    println(message = "Input the second number:  ")
    val inputLuckyNumberTwo = readln().toInt()

   val textResult = if ((inputLuckyNumberTwo == luckyNumberTwo && inputLuckyNumberOne == luckyNumberOne) ||
       (inputLuckyNumberOne == luckyNumberTwo && inputLuckyNumberTwo == luckyNumberOne))
        "Congratulation! You win!"
    else if (inputLuckyNumberOne == luckyNumberOne || inputLuckyNumberTwo == luckyNumberTwo ||
       inputLuckyNumberOne == luckyNumberTwo || inputLuckyNumberTwo == luckyNumberOne)
        "Don't be upset! You've got a consolation prize!"
    else "You lose... Nothing bad! You'll be lucky in love!"

    println(textResult)

}