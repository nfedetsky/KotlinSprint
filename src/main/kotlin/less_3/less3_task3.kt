package org.example.less_3
/*
The multiplication table
 */
fun main() {

    val multiplicationNumber = 7
    var multiplierOfNnumber = 1

    val multiplicationTable = """
        
        $multiplicationNumber x $multiplierOfNnumber = ${multiplicationNumber * multiplierOfNnumber ++}
        $multiplicationNumber x $multiplierOfNnumber = ${multiplicationNumber * multiplierOfNnumber ++}
        $multiplicationNumber x $multiplierOfNnumber = ${multiplicationNumber * multiplierOfNnumber ++}
        $multiplicationNumber x $multiplierOfNnumber = ${multiplicationNumber * multiplierOfNnumber ++}
        $multiplicationNumber x $multiplierOfNnumber = ${multiplicationNumber * multiplierOfNnumber ++}
        $multiplicationNumber x $multiplierOfNnumber = ${multiplicationNumber * multiplierOfNnumber ++}
        $multiplicationNumber x $multiplierOfNnumber = ${multiplicationNumber * multiplierOfNnumber ++}
        $multiplicationNumber x $multiplierOfNnumber = ${multiplicationNumber * multiplierOfNnumber ++}
        $multiplicationNumber x $multiplierOfNnumber = ${multiplicationNumber * multiplierOfNnumber ++}
        $multiplicationNumber x $multiplierOfNnumber = ${multiplicationNumber * multiplierOfNnumber ++}
                
    """.trimIndent()

    println(multiplicationTable)

}