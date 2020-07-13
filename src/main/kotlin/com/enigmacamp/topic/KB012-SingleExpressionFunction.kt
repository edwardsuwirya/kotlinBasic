package com.enigmacamp.topic

//Sebuah deklarasi fungsi hanya dengan 1 baris kode
fun double(a: Int): Int = a * 2

fun hai(name: String): Unit = println("Hello $name")

fun multiply(a: Int, b: Int): Int {
    val result = a * b
    return result
}

fun multiplyCalc(oper1: Int, oper2: Int): Int = multiply(oper1, oper2)

fun main() {
    println(double(2))
    hai("Edo")

    println("Multiply Result : ${multiplyCalc(2, 3)}")
}