package com.neccodes.navigationcomposeapp.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ScreenB(
    onNavigateToScreenC: (String, Int) -> Unit,
    text: String,
    number: Int
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Text(
                text = "Screen B"
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    onNavigateToScreenC("Hello from ScreenB", 9102025)
                }
            ) {
                Text(text = "Navigate to Screen C")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "$text | $number")
        }
    }
}