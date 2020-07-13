package com.enigmacamp.topic

fun sayHello(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }

}

//Default parameter
fun hello(firstName: String, lastName: String = "") {
    println("Hello $firstName $lastName")
}

//Named parameter
fun fullName(firstName: String, middleName: String, lastName: String) {
    println("Hello $firstName $middleName $lastName")
}

//Apabila function tidak melakukan return, sebenarnya function tsb me-return unit
//Java -> void
fun printHello(name: String?): Unit {
    if (name == null) {
        println("Hello gaesss")
    } else {
        println("Hello $name")
    }
}

fun sum(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun main() {
    sayHello("Edo", null)
    sayHello("Edo", "Sasa")
    hello("Apin")

    fullName(lastName = "", firstName = "Edo", middleName = "Sasa")

    printHello(null)

    println(sum(1, 2))
}