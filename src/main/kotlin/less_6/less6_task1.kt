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
        if (i > 0) println("Authorization failed. Try again")
        println("Input your login: ")
        userInputLogin = readln().toString()
        println("Input your password: ")
        userInputPass = readln().toString()
        i++
    } while (userInputLogin != userLogin || userInputPass != userPass)

    println("Authorization successful")
}