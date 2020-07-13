package com.enigmacamp.topic

fun main() {
//  A.K.A Switch Case
    val finalExam = "A"
    when (finalExam) {
        "A" -> {
            println("Luar Biasa")
        }
        "B" -> {
            println("Bagus")
        }
        "C" -> {
            println("Cukup")
        }
        "D" -> {
            println("Kurang")
        }
        "E" -> {
            println("Coba lagi tahun depan")
        }
        else -> {
            println("Nilai tidak diketahui")
        }
    }

    when (finalExam) {
        "A", "B", "C" -> println("Lulus")
        else -> println("Tidak Lulus")
    }

    //Alternatif
    val passValues = arrayOf("A", "B", "C")
    when (finalExam) {
        in passValues -> println("Lulus")
        !in passValues -> println("Tidak Lulus")
    }

    val name = "Edo"
    when (name) {
        is String -> println("Tipe data string")
        !is String -> println("Tipe data bukan string")
    }
}