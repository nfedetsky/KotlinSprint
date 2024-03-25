package org.example.less_5
/*
The age check
 */
import java.util.*

fun main() {

    print("Insert Your year of birth:" + " ")
    val userYearBirth = readln()!!.toInt()
    val myData: Calendar = Calendar.getInstance()
    val userAge = myData.get(Calendar.YEAR) - userYearBirth

    val textResult = if (userAge >= AGE_OF_MAJORITY) "Show content 18+"
    else "Back to the Main page"

    println(textResult)

}

const val AGE_OF_MAJORITY = 18