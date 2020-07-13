package com.enigmacamp.exercise

/*
 * Buat sebuah aplikasi pencatatan pendapatan sebuah toko klontong
 * 1. Pencatatan dimasukan ke dalam sebuah list collection of string
 *    contoh format record => YYYYMMDD,Produk, Qty, Harga
 *                           20200713 ,Telor ,1 kg, 23000
 * 2. Buatlah laporan pendapatan total dari toko tersebut
 * 3. Buatlah laporan pendapatan total berdasarkan produk yang diinput
 *
 */
fun main() {
    var quit = false
    println("=== Sales Application ===")
    do {
        print("Masukan Program Id : ")
        val progId: String? = readLine().toString()
        if (progId.equals("q", ignoreCase = true)) {
            quit = true
        }
    } while (!quit)
    println("=== End Of Application ===")
}