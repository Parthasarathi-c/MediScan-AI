package com.example.mediscan_ai.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mediscan_ai.R
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.runtime.getValue
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.IntOffset
import kotlin.math.roundToInt

@Composable
fun SplashScreen() {
    val infiniteTransition = rememberInfiniteTransition(label = "")

    val scanOffset by infiniteTransition.animateFloat(
        initialValue = -100f,
        targetValue = 100f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 1800,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Restart
        ),
        label = ""
    )

    val scanAlpha by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 0f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 1800,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Restart
        ),
        label = ""
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFFFFFFF),   // White
                        Color(0xFFF8FFFD),   // Very light mint
                        Color(0xFFE8FFF5)    // Soft green
                    )
                )
            )
    ) {

        Column(
            modifier = Modifier.fillMaxSize().padding(top = 90.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(145.dp))
            Card(
                modifier = Modifier.size(110.dp),
                shape = RoundedCornerShape(28.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp
                )
            ) {

                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {

                    Image(
                        painter = painterResource(R.drawable.medscan_logo),
                        contentDescription = "App Logo",
                        modifier = Modifier.size(65.dp)
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.90f)
                            .height(6.dp)
                            .offset {
                                IntOffset(
                                    x = 0,
                                    y = scanOffset.roundToInt()
                                )
                            }
                            .alpha(scanAlpha)
                            .background(Color(0x454EF0A5))
                            .align(Alignment.Center)
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.90f)
                            .height(2.dp)
                            .offset {
                                IntOffset(
                                    x = 0,
                                    y = scanOffset.roundToInt()
                                )
                            }
                            .alpha(scanAlpha)
                            .background(
                                Color(0xFF4EF0A5)
                            )
                            .align(Alignment.Center)
                    )

                }

            }

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = buildAnnotatedString {

                    withStyle(
                        style = SpanStyle(
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                    ) {
                        append("MediScan ")
                    }

                    withStyle(
                        style = SpanStyle(
                            color = Color(0xFF2563EB),
                            fontWeight = FontWeight.Bold
                        )
                    ) {
                        append("AI")
                    }

                },
                fontSize = 48.sp,
            )
            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Precision Diagnostics Powered by\nIntelligence",
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(180.dp))

            CircularProgressIndicator(
                color = Color(0xFF2563EB),
                strokeWidth = 4.dp,
                modifier = Modifier.size(45.dp)
            )
            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "INITIALISING SYSTEMS",
                fontSize = 16.sp,
                letterSpacing = 3.sp,
                color = Color.Gray
            )
        }

    }
}