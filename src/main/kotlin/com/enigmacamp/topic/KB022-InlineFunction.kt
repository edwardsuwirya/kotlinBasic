package com.enigmacamp.topic/*
 * Ketika function lambda di-call berulang, object java selalu dibuat baru
 * Lihat bytecode kotlin untuk perbedaan inline function dengan yang biasa
 */

inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}

inline fun fullName(firstName: () -> String, noinline lastName: () -> String): String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {
    println(hello { "Edo" })
    println(fullName(firstName = { "Edo" }, lastName = { "Sasa" }))
}