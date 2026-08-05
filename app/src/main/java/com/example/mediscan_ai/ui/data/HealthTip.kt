package com.example.mediscan_ai.ui.data

import com.example.mediscan_ai.ui.model.HealthTip

object HealthTips {

    val tips = listOf(

        HealthTip(
            title = "Stay Hydrated",
            description = "Drink enough water after taking medicines to support absorption and stay hydrated."
        ),

        HealthTip(
            title = "Follow Prescription",
            description = "Always take medicines exactly as prescribed by your healthcare provider."
        ),

        HealthTip(
            title = "Do Not Skip Doses",
            description = "Missing doses may reduce the effectiveness of your treatment."
        )

    )
}