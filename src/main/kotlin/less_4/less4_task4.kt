package org.example.less_4
/*
Training schedule
 */
fun main() {

    //Input a training day number
    print("Enter training day number:  ")
    var trainingDay: Int = readln().toInt()

    trainingDay = trainingDay % 2


    //Formation of the schedule
    val armExercise = trainingDay != 0
    val legExercise = trainingDay == 0
    val backExercise = trainingDay == 0
    val absExercise = trainingDay != 0

    val scheduleForToday = """
        Упражнения для рук: $armExercise
        Упражнения для ног: $legExercise
        Упражнение для спины: $backExercise
        пражнение для пресса: $absExercise
    """.trimIndent()

    println(scheduleForToday)

}