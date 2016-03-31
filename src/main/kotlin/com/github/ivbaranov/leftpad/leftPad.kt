package com.github.ivbaranov.leftpad

fun String.leftPad(len: Int, ch: String = " "): String {
    var i = -1

    val length = len - this.length
    val builder = StringBuilder()

    while (++i < length) {
        builder.append(ch)
    }
    builder.append(this)

    return builder.toString()
}