package org.example.less_2

/*
The salary calculation
 */
fun main() {

    //The salary calculation for employees
    val fotOldStaff = 50 * 30000
    //The salary calculation for interns
    val allCostStaff = 30 * 20000 + fotOldStaff
    //The average salary per employee after employment of interns
    val averageFotOfStaff = allCostStaff / (50 + 30)

    //Outputting of results to console
    println("Value of old staff FOT is $fotOldStaff per month")
    println("Value of all costs of staff is $allCostStaff per month")
    println("Value of average FOT of staff is $averageFotOfStaff per month")

}