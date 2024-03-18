package org.example.less_4
/*
Cargo comparison
 */
fun main() {

    var proposedWeight: Int
    var proposedLiquid: Int

    //Comparison of the first cargo
    proposedWeight = 20
    proposedLiquid = 80

    println("Груз с весом $proposedWeight кг и объемом $proposedLiquid л соответствует категории 'Average': ${proposedWeight >= AVERAGE_WEIGHT_MIN &&
    proposedWeight <= AVERAGE_WEIGHT_MAX && proposedLiquid <= VOLUME_LIQUID}")

    //Comparison of the second cargo
    proposedWeight = 50
    proposedLiquid = 100

    println("Груз с весом $proposedWeight кг и объемом $proposedLiquid л соответствует категории 'Average': ${proposedWeight >= AVERAGE_WEIGHT_MIN &&
            proposedWeight <= AVERAGE_WEIGHT_MAX && proposedLiquid <= VOLUME_LIQUID}")

}

//Average parameters

const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100
const val VOLUME_LIQUID = 100