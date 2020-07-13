package com.enigmacamp.topic

fun finalValue(name: String, vararg values: Int) {
    var total = 0
    for (value in values) {
        total += value
    }

    println("Final value $name = $total")
}

fun main() {
    finalValue("Edo", 1, 2, 3, 4, 5)
}