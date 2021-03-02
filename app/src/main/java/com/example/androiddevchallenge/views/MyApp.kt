package com.example.androiddevchallenge.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.nav.MyNavigation
import com.example.androiddevchallenge.pages.DetailsPage
import com.example.androiddevchallenge.pages.HomePage

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = MyNavigation.Home.routeName) {
        composable(MyNavigation.Home.routeName) { HomePage(navController) }
        composable(
            "${MyNavigation.Details.routeName}/{petId}",
            arguments = listOf(navArgument("petId") { type = NavType.IntType })
        ) {
            DetailsPage(navController, id = it.arguments?.getInt("petId") ?: 0) }

    }
}

@Preview
@Composable
fun Prev() {
    MyApp()
}