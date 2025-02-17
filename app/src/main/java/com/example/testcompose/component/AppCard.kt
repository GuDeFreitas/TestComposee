package com.example.testcompose.component

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testcompose.ui.theme.TestComposeTheme

@Composable
fun AppCard(
    modifier: Modifier = Modifier,
    containerColor: Color = Color.White,
    content: @Composable (ColumnScope.() -> Unit),
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(containerColor = containerColor),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        content = content
    )
    
}

@Preview
@Composable
fun AppCardPreview() {
    TestComposeTheme {
        AppCard {

        }
    }
    
}