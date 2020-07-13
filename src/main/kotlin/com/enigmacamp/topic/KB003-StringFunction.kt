package com.enigmacamp.topic

fun main() {
    var firstName: String = "Edo"
    var lastName: String = "Sasa"

    var fullName = firstName + " " + lastName
    var fullNameConcat = "$firstName $lastName"

    var desc: String = "total length of $fullNameConcat = ${fullNameConcat.length} char"

    //Multiline string
    var address1: String = """
        Pondok Bambu
        Jakarta Timur
    """.trimIndent()

    var address2: String = """
        >Jogja
        >Jawa Tengah
    """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(fullName)
    println(fullNameConcat)
    println(desc)
    println()
    println(address1)
    println()
    println(address2)
}