package dev.prabhatpandey.moovees.ui.utils

import kotlin.math.abs

fun Int.asKMString(): String {
    return when {
        abs(this / 1000000) > 1 -> {
            (this / 1000000).toString() + "m"
        }
        abs(this / 1000) > 1 -> {
            (this / 1000).toString() + "k"
        }
        else -> {
            this.toString()
        }
    }
}