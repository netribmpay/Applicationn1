package com.example.laba

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DogData(
    val name: String,
    val age: Int,
    val color: String,
    val sex: String,
    val weight: Int,
    val description: String
): Parcelable

val dogs = arrayOf(
    DogData("Dog1", 12, "Black", "Male", 15, "Funny"),
    DogData("Dog2", 8, "White", "Male", 12, "Funny"),
    DogData("Dog3", 9, "Brown", "Female", 20, "Funny"),
)