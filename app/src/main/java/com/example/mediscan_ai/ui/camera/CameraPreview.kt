package com.example.mediscan_ai.ui.camera

import android.annotation.SuppressLint
import android.content.pm.PackageManager
import androidx.camera.core.CameraSelector
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import androidx.lifecycle.compose.LocalLifecycleOwner
import android.Manifest
import android.content.Context
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.lifecycle.LifecycleOwner

@SuppressLint("UnsafeOptInUsageError")
@Composable
fun CameraPreview(
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current

    val hasCameraPermission = remember {
        mutableStateOf(
            ContextCompat.checkSelfPermission(
                context,
                Manifest.permission.CAMERA
            ) == PackageManager.PERMISSION_GRANTED
        )
    }

    val permissionLauncher =
        rememberLauncherForActivityResult(
            contract = ActivityResultContracts.RequestPermission()
        ) { granted ->
            hasCameraPermission.value = granted
        }

    val previewView = remember {
        PreviewView(context)
    }

    AndroidView(
        factory = {
            previewView
        },
        modifier = modifier
    )

    LaunchedEffect(hasCameraPermission.value) {

        if (!hasCameraPermission.value) {

            permissionLauncher.launch(
                Manifest.permission.CAMERA
            )

            return@LaunchedEffect
        }

        startCamera(
            context = context,
            lifecycleOwner = lifecycleOwner,
            previewView = previewView
        )

    }
}

private fun startCamera(
    context: Context,
    lifecycleOwner: LifecycleOwner,
    previewView: PreviewView
) {
    val cameraProviderFuture = ProcessCameraProvider.getInstance(context)

    cameraProviderFuture.addListener({

        val cameraProvider = cameraProviderFuture.get()

        val preview = Preview.Builder().build()

        preview.surfaceProvider = previewView.surfaceProvider

        val cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA

        try {

            cameraProvider.unbindAll()

            cameraProvider.bindToLifecycle(
                lifecycleOwner,
                cameraSelector,
                preview
            )

        } catch (e: Exception) {
            e.printStackTrace()
        }

    }, ContextCompat.getMainExecutor(context))
}