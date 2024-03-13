package org.example.less_2

/*
The
 */
fun main() {

    //The salary calculation for employees
    val fotOldStaff = OLD_STAFFS_AMOUNT * STAFF_SALARY
    //The salary calculation for interns
    val allCostStaff = INTERN_AMOUNT * INTERN_SALARY + fotOldStaff
    //The average salary per employee after employment of interns
    val averageFotOfStaff = allCostStaff / (OLD_STAFFS_AMOUNT + INTERN_AMOUNT)

    //Outputting of results to console
    println("Value of old staff FOT is $fotOldStaff per month")
    println("Value of all costs of staff is $allCostStaff per month")
    println("Value of average FOT of staff is $averageFotOfStaff per month")

}

const val OLD_STAFFS_AMOUNT = 50
const val STAFF_SALARY = 30000
const val INTERN_AMOUNT = 30
const val INTERN_SALARY = 20000