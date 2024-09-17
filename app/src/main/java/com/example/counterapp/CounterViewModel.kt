package com.example.counterapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    private val _repository : CounterRepository = CounterRepository()
    private val _count = mutableStateOf(_repository.getCounter().Count)

    //Explore the count as an Immutable state.

    val count : MutableState<Int> = _count

    fun increment(){
        _repository.incrementCounter()
        count.value = _repository.getCounter().Count
    }

    fun decrement(){
        _repository.decrementCounter()
        count.value = _repository.getCounter().Count
    }
}