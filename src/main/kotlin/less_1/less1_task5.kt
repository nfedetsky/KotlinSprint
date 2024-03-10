package org.example.less_1

/*
The function of calculation of flight time
 */
fun main() {
    //The time variables
    var timeSec = 6480
    val timeHour: Byte
    val timeMin: Byte

    //The calculation of hours, minutes and seconds of flight
    timeHour = (timeSec / 3600).toByte()
    timeMin = (timeSec / 60 % 60).toByte()
    timeSec = timeSec / 1 % 60

    //Formatted flight time output
    println("$timeHour:$timeMin:$timeSec")
}

