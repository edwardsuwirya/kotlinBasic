package com.enigmacamp.topic/*
 * Lambda menganggap baris terkahir sebagai return
 * Makanya lambda hanya untuk kasus2 sederhana, untuk function yang cukup kompleks digunakan anonymous function
 */

fun main() {
    val anonymousUpper = fun(value: String): String {
        if (value.isBlank()) {
            return ""
        } else {
            return value.toUpperCase()
        }
    }

    println(anonymousUpper("Edo"))
}