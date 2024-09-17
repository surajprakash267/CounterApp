package com.example.counterapp

data class CounterModel(var Count : Int) // It will work as Model in MVVM architecture. This Class will store the count data.

class CounterRepository{
    private var _counter = CounterModel(0)

    fun getCounter() = _counter

    fun incrementCounter(){
        _counter.Count++
    }

    fun decrementCounter(){
        _counter.Count--
    }
}

