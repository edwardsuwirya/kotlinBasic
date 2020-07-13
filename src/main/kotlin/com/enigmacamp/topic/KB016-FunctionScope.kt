package com.enigmacamp.topic

//Saat kita membuat function di dalam file kotlin, maka otomatis bisa diakses dari file kotlin manapun
//Function di kotlin, bisa dibilang 1st class citizen
fun main() {
    fun sayHelloInner() {
        println("Hello World")
    }
    sayHelloInner()
}

fun anotherFunction() {
    //Error
    //sayHelloInner()
}
