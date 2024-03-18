package org.example.less_1

fun main() {

    val productQuant: Byte = 75 //Объявление переменной со значением количества заказов интернет-магазина
    val gratitudeText: String = "Thanks for your purchase!" //Переменная с текстом благодарности
    var numberOfEmployees: Int = 2000 //Задаем начальное количество работников интернет магазина

    //Выводим в консоль количество заказов в магазине
    println("Currently there are space $productQuant orders in the internet store")
    //Выводим в консоль слова благодарности
    println(gratitudeText)
    //Выводим в консоль начальное количество работников магазина
    //println("Currently there are $numberOfEmployees employees in the internet store")

    //Уменьшаем начальное количество работников на одного.
    numberOfEmployees--

    //Выводим в консоль новое количество работников магазина
    println("Oops! No, it's mistake! There are $numberOfEmployees employees in the internet store. Оne employee just quit us!")

}