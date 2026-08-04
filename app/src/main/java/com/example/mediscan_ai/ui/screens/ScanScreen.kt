package com.example.mediscan_ai.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mediscan_ai.ui.components.scanscreen_components.*


@Composable
fun ScanScreen(
    onBackClick: () -> Unit
){
    Column(
        modifier = Modifier
        .fillMaxSize()
        .padding(top = 24.dp)
    ){

        ScanHeader(onBackClick = onBackClick)

        Spacer(modifier = Modifier.height(20.dp))

        CameraPreviewCard()

        Spacer(modifier = Modifier.weight(1f))

        CaptureButton(
            onCaptureClick = {
                // TODO: Open camera / Capture image
            }
        )

        Spacer(modifier = Modifier.height(24.dp))

    }

}

/*
components/

ScanHeader.kt
CameraPreviewCard.kt
CaptureButton.kt
 */