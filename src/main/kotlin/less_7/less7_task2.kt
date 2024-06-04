package org.example.less_7

/*
The sms authorization
 */
fun main() {
    var machineAuthorizationCode: Int
    var userAuthorizationCode: Int
    val numberOfAttempts = (1..3)
    val smsRange = (1000..9999)
    val triesCountdown = mapOf(1 to "two tries", 2 to "one try")

    for (i in numberOfAttempts) {
        println()
        machineAuthorizationCode = smsRange.random()
        println("An authorization code has been sent to you")
        println(machineAuthorizationCode)
        println("Input Your authorization code:")
        userAuthorizationCode = readln().toInt()

        if (userAuthorizationCode == machineAuthorizationCode) {
            println("Authorization successful!")
            return
        } else if (i == numberOfAttempts.last) {
            println("Authorization failed. Access denied. You have no any tries.")
            break
        } else println("Authorization failed. Access denied. You have ${triesCountdown[i]}.")
    }

}