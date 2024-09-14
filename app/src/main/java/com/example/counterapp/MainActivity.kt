/*
Author : Suraj Prakash
Project : Counter App
Email : surajprakash267@gmail.com
Mobile No: +91- 6204086738

 */

package com.example.counterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue

//Import necessary libraries and set up your main activity to
// inherit from ComponentActivity.
//Inside the onCreate() method of MainActivity, set up a
// CounterViewModel instance.
//Use the viewModel() function to initialize CounterViewModel.

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Setting up the content using Jetpack Compose
        setContent {
   //Initialize CounterViewModel using viewModel function
            val counterViewModel : CounterViewModel = viewModel()
            

            // Pass the ViewModel to the Composable

            CounterApp(viewModel = counterViewModel)
        }
    }
}

//Create a composable function CounterApp that takes CounterViewModel as a parameter.
//Within CounterApp, display the counter value and buttons for increment and decrement.
//Bind the increment() and decrement() functions of the ViewModel to these buttons.

@Composable
fun CounterApp(viewModel: CounterViewModel){
    
    // Get the current counter value from the ViewModel
    val counter = viewModel.count
    
    //Compose UI Layout
    Column {
        Text(text = "Counter: $counter", style = MaterialTheme.typography.headlineMedium)
        
        Spacer(modifier = Modifier.height(16.dp))
        
        //Button to Increment the Counter
        Button(onClick = { viewModel.increment() }) {
            Text(text = "Increment Counter")
        }

        //Button to Decrement the Counter
        Button(onClick = { viewModel.decrement() }) {
            Text(text = "Decrement Counter")
        }
        
    }
}