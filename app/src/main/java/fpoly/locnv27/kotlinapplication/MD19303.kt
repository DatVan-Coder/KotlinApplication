package fpoly.locnv27.kotlinapplication

import androidx.compose.ui.util.packInts

/*
///
/// Project: KotlinApplication
/// Created by NguyenLoc on 3/11/2025.
/// Copyright © 2018-2019 Beeknights Co., Ltd. All rights reserved.
///
*/
fun main() {
    val notNullText: String = "Definitely not null"
    val nullableText1: String? = "Might be null"
    val nullableText2: String? = null
    funny(notNullText)
}
fun funny(text: String) {
    if (text != null)
        println(text)
    else
        println("Nothing to print :(")
}
fun funnier(text: String?) {
    val toPrint = text ?: "Nothing to print :("
    println(toPrint)
}

