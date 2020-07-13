package com.enigmacamp.topic

fun String.hello(): String {
    return "Hello $this"
}

fun main() {
    val name: String = "Edo"
    println(name.hello())

    println("Sasa".hello())
}