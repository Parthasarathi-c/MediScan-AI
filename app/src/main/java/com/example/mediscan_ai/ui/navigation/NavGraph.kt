package com.example.mediscan_ai.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mediscan_ai.ui.screens.HomeScreen
import com.example.mediscan_ai.ui.screens.ScanScreen

@Composable
fun NavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {

        composable(Screen.Home.route) {

            HomeScreen(
                onScanClick = {
                    navController.navigate(Screen.Scan.route)
                }
            )

        }

        composable(Screen.Scan.route) {

            ScanScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )

        }

    }

}