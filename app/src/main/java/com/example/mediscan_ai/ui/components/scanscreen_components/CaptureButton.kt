package com.example.mediscan_ai.ui.components.scanscreen_components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun CaptureButton(
    onCaptureClick: () -> Unit
) {

    Button(
        onClick = onCaptureClick,

        modifier = Modifier
            .fillMaxWidth()
            .height(58.dp)
            .padding(horizontal = 20.dp),

        shape = RoundedCornerShape(18.dp),

        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF2563EB)
        )

    ) {

        Icon(
            imageVector = Icons.Default.CameraAlt,
            contentDescription = "Capture"
        )

        Text(
            text = "  Capture Image",
            fontWeight = FontWeight.Bold
        )

    }

}