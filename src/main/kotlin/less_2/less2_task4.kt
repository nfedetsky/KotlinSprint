package org.example.less_2

/*
The buffs calculation
 */
fun main() {

    val cristalOre = 7
    val ironOre = 11
    var buffProcent = 20

    //Calculation and outputting buffs
    println("Buff for cristal ore is ${((cristalOre * buffProcent) / PROCENT_100).toInt()}")
    println("Buff for cristal ore is ${((ironOre * buffProcent) / PROCENT_100).toInt()}")
}
const val PROCENT_100 = 100