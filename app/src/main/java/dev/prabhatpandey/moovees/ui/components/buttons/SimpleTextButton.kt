package dev.prabhatpandey.moovees.ui.components.buttons

import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.prabhatpandey.moovees.ui.theme.MooveesTheme

@Composable
fun SimpleTextButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    TextButton(onClick = onClick, modifier=modifier) {
        Text(text = text)
    }
}

@Preview
@Composable
fun PreviewSimpleTextButton() {
    MooveesTheme {
        SimpleTextButton(
            text = "View All",
            onClick = {}
        )
    }
}