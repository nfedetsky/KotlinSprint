package org.example.less_6

/*
User authorization
 */
fun main() {

    var userLogin: String
    var userPass: String
    var userInputLogin: String
    var userInputPass: String
    var i = 0

    println("Input Your  new login:")
    userLogin = readln().toString()
    println("Input Your new password")
    userPass = readln().toString()

    println("Please log in to the system")
    do {
        println("Input your login: ")
        userInputLogin = readln().toString()
        println("Input your password: ")
        userInputPass = readln().toString()
        if (userInputLogin != userLogin || userInputPass != userPass) println("Authorization failed. Try again")
    } while (userInputLogin != userLogin || userInputPass != userPass)

    println("Authorization successful")
}