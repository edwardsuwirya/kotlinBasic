package com.enigmacamp.topic

fun main() {
    fun display(value: Int) {
        println("Recursive Biasa $value")
        if (value > 0) {
            display(value - 1)
        }
    }

    //Stack Overflow, gunakan tailrec
    display(10000)
}