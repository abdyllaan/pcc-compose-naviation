package com.tjkt.app3abdylla_navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(navController =  navController, startDestination = Routes.screenA){
                composable(Routes.screenA,){
                    LazyColumnListSiswa(navController)
                }
                composable(
                    route = Routes.screenB,
                    arguments = listOf(
                        navArgument("id") {
                            type = NavType.IntType
                        }
                    )
                ) { backStackEntry ->
                    val id = backStackEntry.arguments?.getInt("id")
                    DetailSiswa(id, navController)
                }
            }
        }
    }
}
