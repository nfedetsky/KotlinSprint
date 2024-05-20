package org.example.less_3
/*
The parsing chess string
 */
fun main(){
    val chessMove = "D2-D4;0"

    val stepComposition = chessMove.split("-", ";")

    val startStep = stepComposition[0]
    val destinationStep = stepComposition[1]
    val stepNumber = stepComposition[2]

    val steps = """
        
        $startStep
        $destinationStep
        $stepNumber
             
        
    """.trimIndent()

    println(steps)

}
