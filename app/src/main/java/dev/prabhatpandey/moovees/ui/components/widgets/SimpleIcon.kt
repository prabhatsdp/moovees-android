package dev.prabhatpandey.moovees.ui.components.widgets

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.prabhatpandey.moovees.R
import dev.prabhatpandey.moovees.ui.theme.MooveesTheme

@Composable
fun SimpleIcon(
    @DrawableRes src: Int
) {
    Icon(
        painter = painterResource(id = src),
        contentDescription = "",
        modifier = Modifier
            .width(32.dp)
            .height(32.dp)
    )
}


@Preview
@Composable
fun PreviewSimpleIcon() {
    MooveesTheme {
        SimpleIcon(R.drawable.ic_search)
    }
}