package com.example.myappcompose.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel:ViewModel() {
    var splasLoading by mutableStateOf(true)
    private set

    fun checkAuthentication(){
        viewModelScope.launch {
            delay(5000)
            splasLoading = false
        }
    }
}