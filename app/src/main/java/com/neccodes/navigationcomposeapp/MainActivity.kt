package com.neccodes.navigationcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.neccodes.navigationcomposeapp.routes.Route
import com.neccodes.navigationcomposeapp.screen.ScreenA
import com.neccodes.navigationcomposeapp.screen.ScreenB
import com.neccodes.navigationcomposeapp.screen.ScreenC
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
                        ScreenA(
                            onNavigateToScreenB = {text, number ->
                                navController
                                    .navigate(Route.B(
                                        myText = text,
                                        myNumber = number
                                    ))
                            }
                        )
                    }

                    composable<Route.B> {
                        val args = it.toRoute<Route.B>()
                        ScreenB(
                            onNavigateToScreenC = {yText, yNumber ->
                                navController
                                    .navigate(Route.C(
                                        yourText = yText,
                                        yourNumber = yNumber
                                ))
                            },
                            text = args.myText,
                            number = args.myNumber
                        )
                    }

                    composable<Route.C> {
                        val args = it.toRoute<Route.C>()
                        ScreenC(
                            yText = args.yourText,
                            yNumber = args.yourNumber
                        )
                    }
                }
            }
        }
    }
}

