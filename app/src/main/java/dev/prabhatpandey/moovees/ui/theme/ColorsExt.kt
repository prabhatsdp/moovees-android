package dev.prabhatpandey.moovees.ui.theme

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Colors.textColorDesc: Color
    get() = if (isLight) TextColorDescDark else TextColorDescDark

val Colors.movieCardGradient: Brush
    get() = Brush.verticalGradient(
        0.0f to Color.Transparent,
        0.3f to MovieGradientDarkColor
    )