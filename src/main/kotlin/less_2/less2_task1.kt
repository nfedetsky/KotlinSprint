package org.example.less_2

/*
GPA calculation
 */
fun main() {
    //Calculation of GPA
    val gpa = ((3 + 4 + 3 + 5) / 4).toFloat()

    //Formatted output
    println(String.format("%.2f", gpa))
}