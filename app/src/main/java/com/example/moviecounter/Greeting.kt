package com.example.moviecounter

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Text(
        text = "Hello, MovieCounter App!",
        fontSize = 22.sp,
        modifier = modifier.padding(8.dp)
    )
}