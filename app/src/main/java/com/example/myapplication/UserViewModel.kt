package com.example.myapplication

import androidx.databinding.ObservableInt

data class UserViewModel(
    val name: String,
    val lastName: String,
    val likes: ObservableInt
)