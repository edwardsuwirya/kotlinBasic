package com.enigmacamp.topic

/*
 * Jika recursive function dijalankan terlalu dalam, maka akan terjadi stack overflow error
 * contoh : factorial(5)
 *          factorial(5) => 5 * factorial(4)
 *          factorial(5) => 5 * factorial(4) => 4 * factorial(3)
 *          factorial(5) => 5 * factorial(4) => 4 * factorial(3) => 3 * factorial(2)
 *          factorial(5) => 5 * factorial(4) => 4 * factorial(3) => 3 * factorial(2) => 2 * factorial(1)
 *
 * fungsi factorial akan mengeluarkan hasil, kalau recursive terakhir selesai dieksekusi
 *
 * Tail recursive function adalah teknik mengubah recursive function menjadi looping biasa ketika di-compile
 */
fun main() {
    tailrec fun display(value: Int) {
        println("Recursive Biasa $value")
        if (value > 0) {
            //recursive di tailrec hanya bisa, murni memanggil fungsi dirinya sendiri, tanpa ada nya proses kalkulasi lain
            //display(value - 1) * value => error
            display(value - 1)
        }
    }

    //Stack Overflow, tanpa tailrec di fun display(value: Int)
    display(10000)
}