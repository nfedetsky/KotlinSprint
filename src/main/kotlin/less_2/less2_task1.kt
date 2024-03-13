package org.example.less_2

/*
GPA calculation
 */
fun main() {
    //Calculation of GPA
    val gpa = ((STUD_THE_FIRST + STUD_THE_SECOND + STUD_THE_THIRD + STUD_THE_FORTH) / SUM_STUDENTS).toFloat()

    //Formatted output
    println(String.format("%.2f", gpa))
}
const val STUD_THE_FIRST = 3
const val STUD_THE_SECOND = 4
const val STUD_THE_THIRD = 3
const val STUD_THE_FORTH = 5
const val SUM_STUDENTS = 4