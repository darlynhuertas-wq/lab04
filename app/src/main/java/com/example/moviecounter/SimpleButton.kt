package com.example.moviecounter

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SimpleButton(modifier: Modifier = Modifier) {
    Button(onClick = { }, modifier = modifier.padding(8.dp)) {
        Text("Get Started")
    }
}