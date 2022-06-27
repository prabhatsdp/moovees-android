package dev.prabhatpandey.moovees.ui.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import dev.prabhatpandey.moovees.R

val fonts = FontFamily(
    Font(R.font.poppins_normal),
    Font(R.font.poppins_light, FontWeight.Light),
    Font(R.font.poppins_thin, FontWeight.Thin),
    Font(R.font.poppins_bold, FontWeight.Bold),
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_black, FontWeight.Black),
    Font(R.font.poppins_italic, FontWeight.Normal, style = FontStyle.Italic)
)