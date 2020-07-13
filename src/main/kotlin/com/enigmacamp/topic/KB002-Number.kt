package com.enigmacamp.topic

fun main() {
    var grade: Byte = 10
    var value: Float = 98.10F
    var height: Double = 123403.543
    var salary: Long = 1000000L

    println(grade)
    println(value)
    println(height)
    println(salary)

    //underscore di angka, hanya untuk mempermudah baca
    var totalSalary: Long = 2_342_344_000L
    println(totalSalary)

    //Conversion
    var myNumber: Int = 100
    var float: Float = myNumber.toFloat()
    var str: String = myNumber.toString()

    println(float)
    println(str)
}