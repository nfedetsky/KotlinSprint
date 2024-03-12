package org.example.less_3
/*
The greetings :)
 */
fun main() {

    var wordsOgGreeting: String
    val userName = "Avigdor"

    //Day greeting
    wordsOgGreeting = GREETING_FOR_DAY

    println("$wordsOgGreeting $userName!") //Feature of the Polish greeting - declension of name in personal address

    //Evening greeting
    wordsOgGreeting = GREETING_FOR_EVENING

    println("$wordsOgGreeting $userName!")

}

//Greetings set
const val GREETING_FOR_DAY = "Good day, Mr."
const val GREETING_FOR_EVENING = "Good evening, Mr."