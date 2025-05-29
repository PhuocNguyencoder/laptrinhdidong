package com.example.thuchanh4

import com.example.thuchanh4.screens.ComponentDetailScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.thuchanh4.screens.*

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object ComponentsList : Screen("components_list")
    object ComponentDetail : Screen("component_detail")
}

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            HomeScreen(navController)
        }
        composable(Screen.ComponentsList.route) {
            ComponentsListScreen(navController)
        }
        composable(Screen.ComponentDetail.route) {
            ComponentDetailScreen(navController)
        }
    }
}

