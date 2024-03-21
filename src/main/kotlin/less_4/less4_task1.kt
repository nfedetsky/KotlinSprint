package org.example.less_4

/*
Table reservations
 */
fun main() {

    val amountTablesTomorrow = 9
    val amountTablesToday = 13


    println("Table availability today: ${amountTablesToday < AMOUNT_TABLES}\n" +
            "Table availability today tomorrow: ${amountTablesTomorrow < AMOUNT_TABLES}")
}

const val AMOUNT_TABLES = 13