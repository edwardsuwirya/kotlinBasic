package com.enigmacamp.topic

import java.io.File

fun main() {
    val fileName = "learn_kotlin.txt"
    isFileExist(fileName)
//    createFile(fileName)
    createFileWithText(
        fileName, """
        My First Kotlin File
        It is easy to learn kotlin
        Dreams big dream
    """.trimIndent()
    )
    appendText(fileName, "\nGo Kotlin")
    readFile(fileName)
    copyFile(fileName, "learn_kotlin_copy.txt")
}

fun isFileExist(fileName: String) {
    val fileObject = File(fileName)
    val fileExists = fileObject.exists()
    if (fileExists) {
        println("$fileName file does exist.")
    } else {
        println("$fileName file does not exist.")
    }
}

fun createFile(fileName: String) {
    val fileObject = File(fileName)
    val isFileCreated: Boolean = fileObject.createNewFile()
    if (isFileCreated) {
        println("$fileObject is created successfully.")
    } else {
        println("$fileObject already exists.")
    }
}

fun createFileWithText(fileName: String, content: String) {
    val fileObject = File(fileName)
    fileObject.writeText(content)
}

fun appendText(fileName: String, content: String) {
    val fileObject = File(fileName)
    fileObject.appendText(content)
}

fun readFile(fileName: String) {
    val fileObject = File(fileName)
    fileObject.forEachLine { println(it) }
}

fun copyFile(srcFile: String, dstFile: String) {
    val src = File(srcFile)
    val dst = File(dstFile)
    src.copyTo(dst)
}