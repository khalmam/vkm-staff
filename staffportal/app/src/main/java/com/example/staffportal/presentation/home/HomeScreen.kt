package com.example.staffportal.presentation.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(viewModel: HomeViewModel = viewModel()) {
    val message by viewModel.welcomeMessage.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Staff Portal") })
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(text = message, style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { viewModel.refreshMessage() }) {
                Text("Refresh")
            }
        }
    }
}
