package com.example.moviecounter

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WelcomeCard(modifier: Modifier = Modifier) {
    Card(modifier = modifier.padding(8.dp)) {
        Text(
            text = "Welcome to your Movie Tracker",
            modifier = Modifier.padding(16.dp)
        )
    }
}