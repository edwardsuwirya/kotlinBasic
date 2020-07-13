package com.enigmacamp.topic/*
 * Function yang menggunakan function sebagai parameter atau mengembalikan function
 */

fun hello(value: String, transformer: (String) -> String): String {
    return "Hello ${transformer(value)}"
}

fun main() {
    val upperTransformer = { value: String ->
        value.toUpperCase()
    }

    val lowerTransformer = { value: String ->
        value.toLowerCase()
    }

    println(hello("Edo", upperTransformer))
    println(hello("Sasa", lowerTransformer))
}