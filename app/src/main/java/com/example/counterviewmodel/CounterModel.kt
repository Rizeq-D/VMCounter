package com.example.counterviewmodel

data class CounterModel(var count : Int)

class CounterRepository() {

    private var _counter = CounterModel(0)

    fun getCounter() = _counter

    fun increments() {
        _counter.count ++
    }

    fun decrements() {
        _counter.count --
    }

}