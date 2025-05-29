package com.example.thuchanh4.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ComponentDetailScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clickable {
                navController.popBackStack() // Bấm khoảng trắng quay lại màn hình trước
            }
            .padding(16.dp)
    ) {
        Column {
            Text(
                buildAnnotatedString {
                    append("The ")
                    pushStyle(SpanStyle(textDecoration = TextDecoration.LineThrough))
                    append("quick")
                    pop()
                    append(" ")
                    pushStyle(SpanStyle(color = Color(0xFFA0522D)))
                    append("Brown")
                    pop()
                    append(" fox j")
                    append("u")
                    append("m")
                    append("p")
                    append("s ")
                    pushStyle(SpanStyle(fontWeight = FontWeight.Bold))
                    append("over")
                    pop()
                    append(" the ")
                    pushStyle(SpanStyle(textDecoration = TextDecoration.Underline))
                    append("lazy")
                    pop()
                    append(" dog.")
                }
            )
        }
    }
}
