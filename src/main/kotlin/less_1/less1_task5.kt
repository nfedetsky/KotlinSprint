package org.example.less_1

/*
The function of calculation of flight time
 */
fun main() {
    //The time variables
    var timeSec = 6480
    val timeHour: Int
    val timeMin: Int

    //The calculation of hours, minutes and seconds of flight
    timeHour = (timeSec / SEC_TO_HOUR)
    timeMin = (timeSec / SEC_TO_MINUTE % SEC_TO_MINUTE)
    timeSec = timeSec / ONE_SECOND_MOMENT % SEC_TO_MINUTE

    //Formatted flight time output
    println(String.format("%02d:%02d:%02d", timeHour, timeMin, timeSec))
}

//Calculated values
const val SEC_TO_HOUR = 3600
const val SEC_TO_MINUTE = 60
const val ONE_SECOND_MOMENT = 1

