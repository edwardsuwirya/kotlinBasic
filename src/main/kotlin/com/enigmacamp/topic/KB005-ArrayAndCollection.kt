package com.enigmacamp.topic

fun main() {
    //Tipe data sama
    val members: Array<String> = arrayOf("Edo", "Sasa")
    val balances: Array<Int> = arrayOf(100, 200)

    println(members)
    println(balances)

    val name1 = members[0]
    val name2 = members.get(0)

    println(name1)
    println(name2)

    members.set(1, "Dinda")
    val name3 = members.get(1)
    println(name3)

    //Array of Nullable
    val ages: Array<Int?> = arrayOfNulls(2)
    ages.set(0, null)

    //List immutable
    val list = listOf(2, 3, 4, 5)
    // Error Immutable
    // list[2] = 100
    println(list)

    //List mutable
    val list2 = mutableListOf(2, 3, 4, 9)
    list2[2] = 100
    list2.remove(9)
    println(list2)

    //sets unique index list
    val workers = setOf(2, 3, 4, 5, 5)
    println(workers)
}