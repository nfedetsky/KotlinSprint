package org.example.less_2

/*
The salary calculation
 */
fun main() {

    val oldStaffAmount = 50
    val staffSalary = 30000
    val internAmount =30
    val internSalary = 20000

    //The salary calculation for employees
    val fotOldStaff = oldStaffAmount * staffSalary
    //The salary calculation for interns
    val allCostStaff = internAmount * internSalary + fotOldStaff
    //The average salary per employee after employment of interns
    val averageFotOfStaff = allCostStaff / (oldStaffAmount + internAmount)

    //Outputting of results to console
    println("Value of old staff FOT is $fotOldStaff per month")
    println("Value of all costs of staff is $allCostStaff per month")
    println("Value of average FOT of staff is $averageFotOfStaff per month")

}