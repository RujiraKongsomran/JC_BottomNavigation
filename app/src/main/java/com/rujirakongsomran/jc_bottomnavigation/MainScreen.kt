package com.rujirakongsomran.jc_bottomnavigation

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {},
    ) {
        BottomNavGraph(navController = navController)
    }
}