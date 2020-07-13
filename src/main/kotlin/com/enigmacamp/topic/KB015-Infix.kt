package com.enigmacamp.topic

//Harus sebagai function member / function extension
//Harus memiliki 1 parameter
infix fun String.ubahCase(type: String): String {
    if (type == "U") {
        return this.toUpperCase()
    } else if (type == "L") {
        return this.toLowerCase()
    } else {
        return this
    }
}

infix fun Int.ditambah(opr: Int): Int {
    return this + opr
}

infix fun Int.hasilnya(opr: String): String {
    if (opr.isBlank()) {
        return "hasilnya $this"
    } else {
        return "$opr $this"
    }

}

fun main() {
    val resultUpper = "Edo" ubahCase "U"
    val resultLower = "SaSa" ubahCase "L"

    println(resultUpper)
    println(resultLower)

    println("Kamu".ubahCase("L"))

    val additionResult = (1 ditambah 2) hasilnya ""
    println(additionResult)
}