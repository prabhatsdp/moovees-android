package dev.prabhatpandey.moovees.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.prabhatpandey.moovees.ui.screens.details.DetailScreen
import dev.prabhatpandey.moovees.ui.screens.main.MainScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    val navigate = {screen: Screen -> navController.navigate(screen.route)}

    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(Screen.MainScreen.route) {
            MainScreen(navigate)
        }
        composable(Screen.DetailScreen.route) {
            DetailScreen(navigate)
        }
    }
}

fun mainNavigation(screen: Screen, navController: NavController) {
    when(screen) {
        is Screen.DetailScreen -> {
            navController.navigate(screen.route)
        }
        is Screen.MainScreen -> {
            navController.navigate(screen.route)
        }
    }
}