package org.example.less_4
/*
Growing beans
 */
fun main() {

    //Data block for comparison
    val isTodaySunny: Boolean = true
    val isTentOpenCurrently: Boolean = true
    val humidityToday: Int = 20
    val seasonCurrently: String = "Winter"

    //Comparison result
    val comparisonResult = (WEATHER_SUNNY == isTodaySunny) &&
            (TENT_OPEN == isTentOpenCurrently) &&
            (HUMIDITY == humidityToday) &&
            (SEASON != seasonCurrently)

    println("$QUESTION $comparisonResult")

}

//Basic data block
const val WEATHER_SUNNY: Boolean = true
const val TENT_OPEN: Boolean = true
const val HUMIDITY: Int = 20
const val SEASON: String = "Winter"
const val QUESTION = "Благоприятные ли условия сейчас для роста бобовых? "