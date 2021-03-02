package com.example.androiddevchallenge.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.nav.MyNavigation
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun HomePage(navController: NavHostController){
    Surface(color = MaterialTheme.colors.background) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Adopt Me", style = typography.h6)
            Text(text = "Available Pets", style = typography.caption)
            Button(onClick = {
                navController.navigate("${MyNavigation.Details.routeName}/0")

            }) {
                Text(text = "Go")
            }

        }
    }
}

@Preview
@Composable
fun Prev(){
    MyTheme {
        HomePage(navController = rememberNavController())
    }

}