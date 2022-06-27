package dev.prabhatpandey.moovees.ui.components.rating

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import dev.prabhatpandey.moovees.R
import dev.prabhatpandey.moovees.ui.theme.MooveesTheme
import dev.prabhatpandey.moovees.ui.theme.StarColor

@Composable
fun MovieRatingBar(
    rating: Float,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
    ) {
        var remainingRating = rating
        for (i in 1..5) {
            Icon(
                painter = painterResource(
                    id = when {
                        remainingRating > 1 -> {
                            remainingRating -= 1
                            R.drawable.ic_star_filled
                        }
                        remainingRating < 1 && remainingRating >= 7 -> {
                            remainingRating = 0f
                            R.drawable.ic_star_filled
                        }
                        remainingRating < 1 && remainingRating >= 0.3 -> {
                            remainingRating = 0f
                            R.drawable.ic_star_half
                        }
                        else -> R.drawable.ic_star_empty
                    }
                ),
                contentDescription = "",
                modifier = Modifier.weight(1f),
                tint = StarColor
            )
        }
    }
}


@Preview
@Composable
fun PreviewMovieRatingBar() {
    MooveesTheme { MovieRatingBar(rating = 4.2f) }
}