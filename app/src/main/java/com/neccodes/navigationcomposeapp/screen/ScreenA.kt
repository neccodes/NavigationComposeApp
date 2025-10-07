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
fun ScreenA(
    onNavigateToScreenB: (String, Int) -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Text(
                text = "Screen A"
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    onNavigateToScreenB("Hello from Screen A", 123)
                }
            ) {
                Text(
                    text = "Navigate to Screen B"
                )
            }
        }
    }
}