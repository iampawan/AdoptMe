package com.example.androiddevchallenge.nav

sealed class MyNavigation(val routeName: String) {
    object Home : MyNavigation(routeName = "home")
    object Details : MyNavigation(routeName = "details")
}