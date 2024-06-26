package org.example.less_4
/*
Ship control room
 */
fun main() {

    //Entering parameters

    println("Наличие повреждений")
    val isDamage: Boolean = readln().toBoolean()
    println("Ввод количества персонала")
    val staffCurrent: Int = readln().toInt()
    println("Ввод количесвтва ящиков провизии")
    val numberOfProvisionBoxes: Int = readln().toInt()
    println("Благоприятность погоды")
    val isWeatherCondition: Boolean = readln().toBoolean()


    //Input data analysis block

    val dataAnalysis = ((isDamage == SHIP_INTEGRITY) && (staffCurrent in (STAFF_NUMBER_MIN..STAFF_NUMBER_MAX))
            && (numberOfProvisionBoxes > PROVISION_BOXES_MIN)) ||
            ((isDamage != SHIP_INTEGRITY) && (staffCurrent == STAFF_NUMBER_MAX) &&
                    (numberOfProvisionBoxes >= PROVISION_BOXES_MIN) && (isWeatherCondition == FAVORABLE_WETHER_GOOD))

    //Output analysis result
    println("Корабль может выйти при введенных параметрах: $dataAnalysis")

}

const val SHIP_INTEGRITY = true
const val STAFF_NUMBER_MIN = 55
const val STAFF_NUMBER_MAX = 70
const val PROVISION_BOXES_MIN = 50
const val FAVORABLE_WETHER_GOOD = true