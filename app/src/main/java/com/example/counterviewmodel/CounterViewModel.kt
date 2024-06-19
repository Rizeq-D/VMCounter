package com.example.counterviewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.State


class CounterViewModel : ViewModel(){

    private val _count = mutableStateOf(0)

    // Expose the count as an immutable state
    val count : State<Int> = _count

    fun increment() {
        _count.value ++
    }
    fun decrement() {
        _count.value --
    }

}