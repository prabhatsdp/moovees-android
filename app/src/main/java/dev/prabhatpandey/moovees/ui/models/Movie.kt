package dev.prabhatpandey.moovees.ui.models

import androidx.annotation.DrawableRes

data class Movie(
    val name: String,
    @DrawableRes val imageRes: Int,
    val ratingsCount: Int,
    val ratingsAverage: Double
)
