package com.enigmacamp.topic

/**
 * Kotlin Function adalah first class citizen
 * Bisa disimpan di variable, array, bisa di kirim lewat parameter
 * Lambda expression = anonymous function
 */

fun main() {
    val lambdaName: (String) -> String = { value: String ->
        value.toUpperCase()
    }

    //It keyword hanya bisa dipakai ketika parameter lambda hanya 1
    val lambdaNameIt: (String) -> String = {
        "Hello ${it.toUpperCase()}"
    }

    val lambdaFullName: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        //Statement terakhir adalah return nya
        result
    }

    // Lambda Method Reference
    val lambdaRef: (String) -> String = ::referenceToUpper

    val name = lambdaName("Edo")
    println(name)

    val nameIt = lambdaNameIt("Edo")
    println(nameIt)

    val fullName = lambdaFullName("Edo", "Sasa")
    println(fullName)

    val fullLambdaRef = lambdaRef("Sasa")
    println(fullLambdaRef)

    printName {
        println(it)
    }
}

fun referenceToUpper(value: String): String = value.toUpperCase()

fun printName(firstName: String = "Edo", lastName: String = "Sasa", printer: (fullName: String) -> Unit) {
    printer("$firstName $lastName")
}
