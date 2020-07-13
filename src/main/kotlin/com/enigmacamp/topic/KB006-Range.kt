package com.enigmacamp.topic

fun main() {
    //Isinya cuma angka tapi berurutan
    //Kebutuhannya untuk perulangan
    val range = 0..99
    println(range.count())
    println(range.contains(2))
    println(range.last)

    val rangeDown = 1000 downTo 0 step 5
    println(rangeDown.count())
}