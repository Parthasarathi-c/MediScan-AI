package com.example.mediscan_ai.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AppHeader(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .statusBarsPadding()
            .padding(horizontal = 20.dp, vertical = 17.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(
            text = buildAnnotatedString {

                withStyle(
                    style = SpanStyle(
                        color = Color.Black,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append("MediScan ")
                }

                withStyle(
                    style = SpanStyle(
                        color = Color(0xFF2563EB),
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append("AI")
                }
            }

        )

        Spacer(modifier = Modifier.weight(1f))

        IconButton(
        onClick = {
            // TO DO : Open settings
        }
        ) {
            Icon(
                imageVector = Icons.Default.Settings,
                contentDescription = "Settings",
                tint = Color.LightGray
            )
        }

    }
}