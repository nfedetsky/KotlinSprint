package org.example.less_7
/*
The password generator second
 */
fun main() {
    val passSimbol: CharRange = ('a'..'z')
    val passHighSimbol: CharRange = ('A'..'Z')
    val passNumeric: CharRange = ('1'..'9')
    val passSpecSimbol = arrayOf('!', '@', '#', '$', '%', '&', '*', '?', '/')
    val lenPassString = 0..255
    val tempArray = mutableSetOf<Char>()
    var passString: String
    var userNumber: Int


    println("Input your length password string")
    println("The line must be at least six characters long")
    userNumber = readln().toInt()

    if (userNumber >= LIMIT_LENGHT_OF_PASSWORD_WORD) {
        for (i in lenPassString) {
            tempArray.add(passSimbol.random())
            tempArray.add(passHighSimbol.random())
            tempArray.add(passNumeric.random())
            tempArray.add(passSpecSimbol.random())
        }
        passString = tempArray.shuffled().take(userNumber).joinToString().replace(", ", "")
        println(passString)
    } else println("Length does not meet requirements")
}

const val LIMIT_LENGHT_OF_PASSWORD_WORD = 6