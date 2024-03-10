package org.example.less_1

/*
The function for outputting the start and end times of Yuri Gagarin's flight
 */
fun main() {

    val yearOfGFlight = 1961 //The year of Yuri Gagarin's flight
    var hour: String = "09" //The hour og flight. Initial value - our of start
    var minutes: String = "07" //The minutes og flight. Initial value - minutes of start
    val space = ' '

    //Output of the year of flight
    println("Year of flight:" + space + yearOfGFlight)
    //Output of hour of start flight
    println("Hour of start flight:" + space + hour)
    //Output of minutes of start flight
    println("Minutes of start flight:" + space + minutes)

    //Enter hour of the end of the flight
    println("Enter hour of the end of the flight")
    hour = readln().toString()

    //Enter minutes of the end of the flight
    println("Enter minutes of the end of the flight")
    minutes = readln().toString()

    //Output time value in one line
    print("End time of flight:" + space)
    print(hour)
    print(":")
    print(minutes)

}
