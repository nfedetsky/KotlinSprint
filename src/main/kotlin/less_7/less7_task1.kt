package org.example.less_7
/*
The password generator
 */
fun main() {
    val passSimbol: CharRange = ('a'..'z')
    val passHighSimbol: CharRange = ('A'..'Z')
    val passNumeric: CharRange = ('1'..'9')
    val lenPassString = 0..255
    val tempArray = mutableSetOf<Char>()
    var passString: String

    for (i in lenPassString) {
        tempArray.add(passSimbol.random())
        tempArray.add(passNumeric.random())
        tempArray.add(passHighSimbol.random())
    }
    passString = tempArray.shuffled().take(6).joinToString().replace(", ", "")
    println(passString)
}
