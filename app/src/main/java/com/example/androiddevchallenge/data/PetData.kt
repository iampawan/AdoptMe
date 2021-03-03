package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Pet

object PetData {
    val pets = listOf<Pet>(
        Pet(1, "Spaniel", "Dog", "This beautiful and uncommon creature is a type of dog.", "0xff000000", R.drawable.p1, "India"),
        Pet(2, "Schnauzer", "Dog", "This amazing, but often seen creature is a type of dog.", "0xff000000", R.drawable.p2, "Germany"),
        Pet(3, "Malamute", "Dog", "This weird and incredibly rare creature is a type of dog.", "0xff000000", R.drawable.p3, "Australia"),
        Pet(4, "Bluetick", "Dog", "This special and seldom seen creature is a type of dog.", "0xff000000", R.drawable.p4, "USA"),
        Pet(5, "Cairn", "Dog", "This amazing and nearly extinct creature is a type of dog. ", "0xff000000", R.drawable.p5, "UK"),
        Pet(6, "Bengal", "Cat", "This amusing, but extremely common creature is a type of cat. ", "0xff000000", R.drawable.p6, "Europe"),
    )

}