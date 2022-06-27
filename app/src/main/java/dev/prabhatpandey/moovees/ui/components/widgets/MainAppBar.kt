package dev.prabhatpandey.moovees.ui.components.widgets

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.prabhatpandey.moovees.R
import dev.prabhatpandey.moovees.ui.theme.MooveesTheme

@Composable
fun MainAppBar() {
    Row(
        modifier = Modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = "Location",
                style = MaterialTheme.typography.caption,
                color = MaterialTheme.colors.onBackground.copy(alpha = 0.7f)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Chandigarh"
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_drop_down),
                    contentDescription = "",
                )
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        SimpleIcon(src = R.drawable.ic_search)
        Spacer(modifier = Modifier.width(12.dp))
        SimpleIcon(src = R.drawable.ic_notifications)
    }
}

@Preview
@Composable
fun PreviewMainAppBar() {
    MooveesTheme {
        Surface {
            MainAppBar()
        }
    }
}