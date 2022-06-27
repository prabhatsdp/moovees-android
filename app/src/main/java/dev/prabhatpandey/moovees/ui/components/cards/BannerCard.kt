@file:OptIn(ExperimentalMaterialApi::class)

package dev.prabhatpandey.moovees.ui.components.cards

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.prabhatpandey.moovees.R
import dev.prabhatpandey.moovees.ui.models.Movie
import dev.prabhatpandey.moovees.ui.theme.MooveesTheme

@Composable
fun BannerCard(
    onClick: () -> Unit,
    movie: Movie,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(1.7f)
            .padding(horizontal = 16.dp),
        onClick = onClick,
        shape = RoundedCornerShape(10.dp)
    ) {
        Image(
            painter = painterResource(id = movie.imageRes),
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}

@Preview
@Composable
fun PreviewBannerCard() {
    MooveesTheme {
        BannerCard(
            onClick = {},
            movie = Movie(
                "Multiverse",
                R.drawable.image_25,
                10,
                4.5
            )
        )
    }
}