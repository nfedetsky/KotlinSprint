package org.example.less_5
/*
The lottery
 */
fun main(){

    //Lottery reference indexes
    val luckyNumberOne = 0
    val luckyNumberTwo = 42

    //Input the first number
    println(message = "Ведите первое число лотереи:  ")
    val inputLuckyNumberOne = readln().toInt()
    var  textResult = if (inputLuckyNumberOne == luckyNumberOne) "Поздравляем, Вы выиграли первое число!"
    else "Что ж... У Вас еще есть одна попытка, может она приведет к утешительному призу!"

    println(textResult)

    //Input the second number
    println(message = "Введите второе число лотереи:  ")
    val inputLuckyNumberTwo = readln().toInt()
    textResult = if (inputLuckyNumberTwo == luckyNumberTwo && inputLuckyNumberOne == luckyNumberOne) "Поздравляем, Вы выиграли!"
    else if (inputLuckyNumberTwo == luckyNumberTwo || inputLuckyNumberTwo == luckyNumberOne) "Не расстраивайтесь! Вы получили утешительный приз!"
    else "Вы проиграли... Ничего страшного, повезет в любви!"

    println(textResult)

}