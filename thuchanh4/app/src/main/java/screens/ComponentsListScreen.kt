package com.example.thuchanh4.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.thuchanh4.Screen

@Composable
fun ComponentsListScreen(navController: NavController) {
    val items = listOf("Text", "Image", "TextField", "PasswordField", "Column", "Row")

    Column(modifier = Modifier.padding(16.dp)) {
        Text("UI Components List", style = MaterialTheme.typography.h6)
        Spacer(modifier = Modifier.height(16.dp))

        items.forEach { item ->
            Button(
                onClick = { navController.navigate(Screen.ComponentDetail.route) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
            ) {
                Text(item)
            }
        }
    }
}
