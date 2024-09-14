/*
Author : Suraj Prakash
Project : Counter App
Email : surajprakash267@gmail.com
Mobile No: +91- 6204086738
*/

package com.example.counterapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

// Defining a class CounterViewModel that inherits from ViewModel.
class CounterViewModel : ViewModel() {
 //Inside the CounterViewModel class, create a private mutable state
// variable _count initialized to 0. The underscore (_) indicates that it's a private variable.
    private val _count = mutableStateOf(0)

    //Create a public immutable state variable count that reflects the value of _count.
    //Ensure it's a MutableState type but exposed as an immutable state

    val count = _count.value

    //Define two functions increment() and decrement() that modify _count.
   // These will be used to change the counter value.

    fun increment(){
        _count.value+=1 // _count.value = _count.value + 1
    }

    fun decrement(){
        _count.value-=1 // _count.value = _count.value - 1
    }







}