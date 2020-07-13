package com.enigmacamp.topic

//Harus sebagai function member / function extension
//Harus memiliki 1 parameter
infix fun String.ubahCase(type: String): String {
    if (type == "U") {
        return this.toUpperCase()
    } else if (type == "L") {
        return this.toLowerCase()
    } else {
        return this
    }
}

fun main() {
    val resultUpper = "Edo" ubahCase "U"
    val resultLower = "SaSa" ubahCase "L"

    println(resultUpper)
    println(resultLower)

    println("Kamu".ubahCase("L"))
}