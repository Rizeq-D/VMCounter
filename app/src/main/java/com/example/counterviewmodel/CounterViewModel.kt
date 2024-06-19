package com.example.counterviewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


class CounterViewModel() : ViewModel(){

    private val _repository : CounterRepository = CounterRepository()
    private val _count = mutableStateOf(_repository.getCounter().count)

    // Expose the count as an immutable state
    val count : State<Int> = _count

    fun increment() {
        _repository.increments()
        _count.value = _repository.getCounter().count
    }
    fun decrement() {
        _repository.decrements()
        _count.value = _repository.getCounter().count
    }

}