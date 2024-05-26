package org.example.less_6

/*
User authorization
 */
fun main() {

    var userLogin: String
    var userPass: String
    var userInputLogin: String
    var userInputPass: String
    println("Input Your  new login:")
    userLogin = readln()
    println("Input Your new password")
    userPass = readln()

    println("Please log in to the system")
    do {
        println("Input your login: ")
        userInputLogin = readln()
        println("Input your password: ")
        userInputPass = readln()
        if (userInputLogin != userLogin || userInputPass != userPass) println("Authorization failed. Try again")
    } while (userInputLogin != userLogin || userInputPass != userPass)

    println("Authorization successful")
}