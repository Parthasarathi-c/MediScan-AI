package com.example.mediscan_ai.ui.navigation

sealed class Screen(val route: String) {

    object Splash : Screen("splash")

    object Home : Screen("home")

    object Scan : Screen("scan")

}