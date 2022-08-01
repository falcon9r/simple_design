package com.example.login

import androidx.compose.runtime.Composable

sealed class NavRoutes(val Route: String){
    object Welcome : NavRoutes("welcome")
    object Login : NavRoutes("login")
    object Register : NavRoutes("register")
}
