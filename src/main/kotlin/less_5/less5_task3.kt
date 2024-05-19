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
    var  textResult = if (inputLuckyNumberOne == luckyNumberOne || inputLuckyNumberOne == luckyNumberTwo)
        "Congratulation! You win the first number!"
    else "Well... You have one more attempt! Maybe it will lead to a consolation prize."

    println(textResult)

    //Input the second number
    println(message = "Input the second number:  ")
    val inputLuckyNumberTwo = readln().toInt()
    textResult = if (inputLuckyNumberTwo == luckyNumberTwo && inputLuckyNumberOne == luckyNumberOne) "Congratulation! You win!"
    else if (inputLuckyNumberTwo == luckyNumberOne && inputLuckyNumberOne == luckyNumberTwo) "Congratulation! You win!"
    else if ((inputLuckyNumberTwo == luckyNumberTwo && inputLuckyNumberTwo != luckyNumberOne)
        || (inputLuckyNumberOne != luckyNumberTwo && inputLuckyNumberTwo == luckyNumberOne))
        "Don't be upset! You've got a consolation prize!"
    else "You lose... Nothing bad! You'll be lucky in love!"

    println(textResult)

}