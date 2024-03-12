package org.example.less_2

import kotlin.math.pow

/*
The simple bank calculator
 */
fun main() {

    val contributionSum = 70000
    val interestRate = 16.7 / 100
    val depositTerm: Int = 20

    /*
    Calculation by formula: S=A*(1+R)^T, where
        A - Contribution sum
        R - Interest rate
        T - Number of accrual periods, deposit term
        S - Final sum, deposit amount
     */
    val depositAmount = contributionSum * (1 + interestRate).pow(depositTerm)

    //Output result calculation based on the mask: x.xxx
    println(String.format("%.3f", depositAmount))
}
