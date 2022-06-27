package dev.prabhatpandey.moovees.ui.components.buttons

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import dev.prabhatpandey.moovees.ui.theme.MooveesTheme

@OptIn(ExperimentalUnitApi::class)
@Composable
fun SubmitButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(20),
        modifier = modifier,
        enabled = true,
        colors = ButtonDefaults.buttonColors()
    )
    {
        Text(
            text = text,
            modifier = Modifier.padding(16.dp, 8.dp),
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                letterSpacing = TextUnit(2f, TextUnitType.Sp)
            )
        )
    }
}

@Preview
@Composable
fun PreviewSubmitButton() {
    MooveesTheme {
        SubmitButton("Submit", onClick = {})
    }
}