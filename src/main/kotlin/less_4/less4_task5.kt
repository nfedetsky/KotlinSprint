package org.example.less_4
/*
Ship control room
 */
fun main() {

    //Entering parameters

    println("Наличие повреждений")
    var damagePresent: Boolean = readln().toBoolean()
    println("Ввод количества персонала")
    var staffCurrent: Int = readln().toInt()
    println("Ввод количесвтва ящиков провизии")
    var numberOfProvisionBoxes: Int = readln().toInt()
    println("Благоприятность погоды")
    var favorableWeatherConditions: Boolean = readln().toBoolean()


    //Input data analysis block

    val dataAnalysis = ((damagePresent == SHIP_INTEGRITY) && (staffCurrent in (STAFF_NUMBER_MIN..STAFF_NUMBER_MAX))
            && (numberOfProvisionBoxes > PROVISION_BOXES_MIN)) ||
            ((damagePresent != SHIP_INTEGRITY) && (staffCurrent == STAFF_NUMBER_MAX) &&
                    (numberOfProvisionBoxes >= PROVISION_BOXES_MIN) && (favorableWeatherConditions == FAVORABLE_WETHER_GOOD))

    //Output analysis result
    println("Корабль может выйти при введенных параметрах: $dataAnalysis")

}

const val SHIP_INTEGRITY = true
const val STAFF_NUMBER_MIN = 55
const val STAFF_NUMBER_MAX = 70
const val PROVISION_BOXES_MIN = 50
const val FAVORABLE_WETHER_GOOD = true