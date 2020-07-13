package com.enigmacamp.topic

//Parameter with null
fun sayHelloAllowNull(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }

}

//Default parameter
fun helloWithDefaultParameter(firstName: String, lastName: String = "") {
    println("Hello $firstName $lastName")
}

//Named parameter
fun fullNameNamedParameter(firstName: String, middleName: String, lastName: String) {
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

//Contoh function return Int
fun sum(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun main() {
    sayHelloAllowNull("Edo", null)
    sayHelloAllowNull("Edo", "Sasa")
    helloWithDefaultParameter("Apin")

    fullNameNamedParameter(lastName = "", firstName = "Edo", middleName = "Sasa")

    printHello(null)

    println(sum(1, 2))
}