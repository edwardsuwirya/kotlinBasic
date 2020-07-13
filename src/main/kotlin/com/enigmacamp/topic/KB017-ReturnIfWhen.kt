package com.enigmacamp.topic

fun main() {
    fun sayHello(name: String): String {
        return if (name == "") {
            "Hello gaess"
        } else {
            "Hello $name"
        }
    }

    fun sayHelloWhen(name: String): String {
        return when (name) {
            "" -> "Hello gaess"
            else -> "Hello $name"
        }
    }
    println(sayHello("Edo"))
    println(sayHelloWhen("Sasa"))
}