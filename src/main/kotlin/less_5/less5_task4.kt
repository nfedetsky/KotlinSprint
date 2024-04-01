package org.example.less_5

/*
Navigator's check
 */
fun main() {

    var userLogin = "Zaphod"
    var userPass = "PanGalactic"
    val comparisonUser: String
    val comparisonPass: String

    println("Hello! Enter your credential login: ")
    comparisonUser = readln().toString()
    println("Enter your credential password: ")
    comparisonPass = readln().toString()
    val helloText = if (comparisonUser == userLogin && comparisonPass == userPass) {
        println("Welcome aboard, Mr. Navigator!")
    } else {
        println("You are not registered. Perform the registration procedure")
        println("Enter your new login: ")
        userLogin = readln().toString()
        println("Enter your new password: ")
        userPass = readln().toString()

        println("You've successfully completed the registration procedure! Welcome aboard, Mr. Navigator!")
    }


}