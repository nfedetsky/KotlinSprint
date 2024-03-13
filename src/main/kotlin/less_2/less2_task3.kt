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
    val hourToDestination = timeToDestination / SEC_TO_MIN
    val minutesToDestination = timeToDestination / SEC_TO_MIN % SEC_TO_MIN

    //The calculation of arrival time
    val endMinutes = (startMinutes + minutesToDestination) % SEC_TO_MIN
    val endHour = (startHour + hourToDestination) + (startMinutes + minutesToDestination) / SEC_TO_MIN

    //Output arrival time to console
    println("Arrival time is $endHour:$endMinutes")
}

const val SEC_TO_MIN = 60