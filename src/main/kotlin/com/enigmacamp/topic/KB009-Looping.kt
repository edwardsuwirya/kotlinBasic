package com.enigmacamp.topic

fun main() {
    val names = arrayOf("Edo", "Sasa")
    for (name in names) {
        println(name)
    }

    val namesLength = names.size - 1
    for (i in 0..namesLength) {
        println("index $i : ${names[i]}")
    }

    for (value in 0..10 step 2) {
        println("Bilangan genap $value")
    }

    var i = 0
    while (i < 10) {
        println("Nilai i :$i")
        i++
    }

    var x = 0
    while (true) {
        println("Nilai x : $x")
        x++
        if (x > 10) {
            break
        }
    }

    for (ganjil in 1..10) {
        if (ganjil % 2 == 0) {
            continue
        }

        println("Ganjil : $ganjil")
    }
}