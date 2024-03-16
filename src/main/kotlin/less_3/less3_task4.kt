package org.example.less_3
/*
Chess - almost central debut
 */
fun main() {
    var startStep = "E2"
    var destinationStep = "E4"
    var stepNumber = 1


    //Outputting the first step of Wite
    println("$startStep-$destinationStep:${stepNumber ++}")

    //Outputting the second step of Wite
    startStep = "D2"
    destinationStep = "D3"
    println("$startStep-$destinationStep:$stepNumber")
}