package dev.prabhatpandey.moovees.ui.components.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.prabhatpandey.moovees.R
import dev.prabhatpandey.moovees.ui.components.rating.MovieRatingBar
import dev.prabhatpandey.moovees.ui.components.text.MediumHeading
import dev.prabhatpandey.moovees.ui.models.Movie
import dev.prabhatpandey.moovees.ui.theme.MooveesTheme
import dev.prabhatpandey.moovees.ui.theme.movieCardGradient
import dev.prabhatpandey.moovees.ui.utils.asKMString

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MovieCard(
    onClick: () -> Unit,
    movie: Movie
) {
    Card(
        modifier = Modifier
            .height(300.dp)
            .aspectRatio(0.7F)
            .padding(horizontal = 8.dp),
        onClick = onClick,
        shape = RoundedCornerShape(10.dp),
        elevation = 10.dp
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = movie.imageRes),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        brush = MaterialTheme.colors.movieCardGradient
                    )
                    .align(Alignment.BottomStart)
                    .padding(start = 16.dp, end = 16.dp, bottom = 12.dp, top = 16.dp)

            ) {
//                Spacer(modifier = Modifier.weight(1f))
                MediumHeading(
                    text = movie.name,
                    modifier = Modifier.padding(bottom = 4.dp).fillMaxWidth().wrapContentHeight()
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    MovieRatingBar(
                        rating = movie.ratingsAverage.toFloat(),
                        modifier = Modifier.fillMaxWidth(0.5f)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = movie.ratingsCount.asKMString(),
                        style = MaterialTheme.typography.body1
                    )
                }

            }
        }
    }
}

@Preview
@Composable
fun PreviewMovieCard() {
    MooveesTheme {
        MovieCard(
            onClick = {},
            movie = Movie(
                "Captain Marvel",
                imageRes = R.drawable.image_18,
                100_000,
                4.5
            )
        )
    }
}