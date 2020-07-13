package com.enigmacamp.topic

//Variable constant untuk kebutuhan global
//const val APP = "Learn Kotlin"
//const val APP_VERSION = "1.0"

fun main() {
    //Mutable (bisa dirubah)
    var firstName: String = "edo"
    var lastName = "Sasa"

    //Imutable (tidak bisa dirubah)
    val fullName = "Edo Sasa"
    // fullName = "123" => akan error

    //Default tipe data integer
    val age = 30
    val salary = 1000000L

    println(firstName)
    println(lastName)
    println(fullName)
    println(age)
    println(salary)


    //Nullable
    //Standar nya variable di kotlin wajib diisi
    //Variable bisa bernilai null, gunakan ? setelah tipe data (tidak direkomendasikan)
    var birthPlace: String? = "Jakarta"
    birthPlace = null

    // println(birthPlace.length) => akan error, karena bisa null
    println(birthPlace?.length)
}