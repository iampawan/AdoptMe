package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Pet

object PetData {
    val pets = listOf<Pet>(
        Pet(1, "Spaniel", "Dog", "spaniel-cocker", "0xff000000", R.drawable.p1, "India"),
        Pet(2, "Schnauzer", "Dog", "schnauzer-giant", "0xff000000", R.drawable.p2, "India"),
        Pet(3, "Malamute", "Dog", "malamute", "0xff000000", R.drawable.p3, "India"),
        Pet(4, "Bluetick", "Dog", "bluetick", "0xff000000", R.drawable.p4, "India"),
        Pet(5, "Cairn", "Dog", "cairn", "0xff000000", R.drawable.p5, "India"),
        Pet(6, "Bengal", "Cat", "Bengal", "0xff000000", R.drawable.p6, "India"),
    )

}