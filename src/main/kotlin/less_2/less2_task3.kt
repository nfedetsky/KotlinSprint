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
    val hourToDestination = timeToDestination / 60
    val minutesToDestination = timeToDestination / 60 % 60

    //The calculation of arrival time
    val endMinutes = (startMinutes + minutesToDestination) % 60
    val endHour = (startHour + hourToDestination) + (startMinutes + minutesToDestination) / 60

    //Output arrival time to console
    println("Arrival time is $endHour:$endMinutes")
}