package com.neccodes.navigationcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.neccodes.navigationcomposeapp.routes.Route
import com.neccodes.navigationcomposeapp.screen.ScreenA
import com.neccodes.navigationcomposeapp.screen.ScreenB
import com.neccodes.navigationcomposeapp.ui.theme.NavigationComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationComposeAppTheme {

                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = Route.A
                ) {
                    composable<Route.A> {
                        ScreenA()
                    }

                    composable<Route.B> {
                        ScreenB()
                    }
                }
            }
        }
    }
}

