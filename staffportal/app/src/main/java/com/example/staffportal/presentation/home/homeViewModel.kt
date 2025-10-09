package com.example.staffportal.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel : ViewModel() {

    private val _welcomeMessage = MutableStateFlow("Welcome to Staff Portal")
    val welcomeMessage: StateFlow<String> = _welcomeMessage

    fun refreshMessage() {
        viewModelScope.launch {
            _welcomeMessage.emit("Data refreshed at ${System.currentTimeMillis()}")
        }
    }
}
