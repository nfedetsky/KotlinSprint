package org.example.less_5

/*
The Lice check
 */
fun main() {

    print(message = "Enter the correct solution to the example\n '2 x 2' is...  ")
    val verificationValue = readln().toInt()

    //checking the correctness of the entered data
    if (verificationValue == REFERENCE_VALUE) {

        println("Welcome to the program!")

    } else {
        println("Access denied!")
    }
}

const val REFERENCE_VALUE = 4