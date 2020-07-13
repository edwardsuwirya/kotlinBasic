package com.enigmacamp.topic

fun main() {
    print("Masukan nama : ")
    val name: String? = readLine().toString()

    print("Masukan Umur : ")
    val age: Int = readLine()!!.toInt()

    println("=== User Info ===")
    println("Nama : $name")
    println("Umur : $age")
}