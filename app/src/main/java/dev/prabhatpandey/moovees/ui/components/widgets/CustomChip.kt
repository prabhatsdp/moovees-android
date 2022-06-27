package dev.prabhatpandey.moovees.ui.components.widgets

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.prabhatpandey.moovees.ui.theme.MooveesTheme
import dev.prabhatpandey.moovees.ui.theme.fonts

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CustomChip(
    isChecked: Boolean,
    text: String,
    onClick: () -> Unit
) {
    Card(
        elevation = 0.dp,
        shape = RoundedCornerShape(100),
        backgroundColor = if (isChecked) MaterialTheme.colors.primary else Color.Transparent,
        border = BorderStroke(
            width = 1.dp,
            color = if (!isChecked) MaterialTheme.colors.onPrimary.copy(alpha = 0.4f) else Color.Transparent
        ),
        onClick = onClick,
        modifier = Modifier.padding(horizontal = 4.dp)
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(
                start = 16.dp,
                end = 16.dp,
                top = 8.dp,
                bottom = 6.dp
            ),
            color = if (isChecked) MaterialTheme.colors.onPrimary else MaterialTheme.colors.onPrimary.copy(
                alpha = 0.4f
            ),
            style = MaterialTheme.typography.body1.copy(fontSize = 12.sp)
        )
    }
}


@Preview
@Composable
fun PreviewCustomChip() {
    MooveesTheme {
        Surface {
            CustomChip(
                true,
                "Custom Chip",
                onClick = {}
            )
        }
    }
}