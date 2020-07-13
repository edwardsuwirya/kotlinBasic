package com.enigmacamp.topic/*
 * Bisa digunakan untuk break, continue , dan return
 */
fun main() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            println("$i * $j = ${i * j}")
            if (j == 2) {
                break@loopI
            }
        }
    }

    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)

    test("Edo") {
        println(it)
    }

    test("") test@{
        if (it == "") {
            return@test
        } else {
            println(it)
        }
    }
}