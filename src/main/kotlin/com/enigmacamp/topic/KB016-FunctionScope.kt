package com.enigmacamp.topic

//Saat kita membuat function di dalam file kotlin, maka otomatis bisa diakses dari file kotlin manapun
//Function di kotlin, bisa dikatakan 1st class citizen
fun main() {
    //function sayHelloInner hanya bisa diakses dari main function
    fun sayHelloInner() {
        println("Hello World")
    }
    sayHelloInner()
}

fun anotherFunction() {
    //Error
    //sayHelloInner()
}
