package org.example.less_7

/*
The password generator the second
 */
fun main() {

    val tempArray = ('a'..'z') + ('A'..'Z') + ('1'..'9')
    var passString: String
    var userNumber: Int


    println("Input your length password string")
    println("The line must be at least six characters long")
    userNumber = readln().toInt()

    if (userNumber >= LIMIT_LENGHT_OF_PASSWORD_WORD) {
        passString = tempArray.shuffled().take(userNumber).joinToString().replace(", ", "")
        println(passString)
    } else println("Length does not meet requirements")
}

const val LIMIT_LENGHT_OF_PASSWORD_WORD = 6