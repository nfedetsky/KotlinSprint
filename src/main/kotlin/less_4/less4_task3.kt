package org.example.less_4
/*
Growing beans
 */
fun main() {

    //Basic data block
    val weatherSunny: Boolean = true
    val tentOpen: Boolean = true
    val humidity: Int = 20
    val season: String = "Winter"
    val question = "Благоприятные ли условия сейчас для роста бобовых? "

    //Data block for comparison
    val weatherTodaySunny: Boolean = true
    val tentOpenCurrently: Boolean = true
    val humidityToday: Int = 20
    val seasonCurrently: String = "Winter"

    //Comparison result
    val comparisonResult = (weatherSunny == weatherTodaySunny) &&
            (tentOpen == tentOpenCurrently) &&
            (humidity == humidityToday) &&
            (season == seasonCurrently)

    println("$question $comparisonResult")

}