package com.enigmacamp.topic

//Menambahkan kemampuan baru dari sebuah object
fun String.hello(): String {
    return "Hello $this"
}

fun Int.genap(): Int? {
    if (this % 2 == 0) {
        return this
    } else {
        return null
    }
}

fun main() {
    val name: String = "Edo"
    println(name.hello())

    println("Sasa".hello())

    val myNumbers = arrayOf(1, 2, 3, 4, 5, 6, 7)
    for (n in myNumbers) {
        if (n.genap() != null) {
            println(n)
        }
    }
}