package dev.prabhatpandey.moovees.ui.components.text

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import dev.prabhatpandey.moovees.ui.theme.MooveesTheme

@Composable
fun MediumHeading(
    text: String,
    textStyle: TextStyle = MaterialTheme.typography.h3,
    modifier: Modifier = Modifier
) {
    Text(text = text, style = textStyle, modifier = modifier)
}


@Preview
@Composable
fun PreviewMediumHeading() {
    MooveesTheme {
        MediumHeading(
            "Medium Heading"
        )
    }
}