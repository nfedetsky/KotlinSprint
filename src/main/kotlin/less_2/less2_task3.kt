package org.example.less_2

/*
The calculation of arrival time
 */
fun main() {

    //The parameters of train start time
    val startHour = 9
    val startMinutes = 39
    val timeToDestination = 457

    //Bringing time to a general form
    val hourToMin = startHour * SEC_TO_MIN + startMinutes
    val allMinuteToEnd = hourToMin + timeToDestination

    //The calculation of arrival time
    val endHour = allMinuteToEnd / SEC_TO_MIN
    val endMinutes = allMinuteToEnd % SEC_TO_MIN

    //Output arrival time to console
    println(String.format("%02d:%02d", endHour, endMinutes))

}

const val SEC_TO_MIN = 60