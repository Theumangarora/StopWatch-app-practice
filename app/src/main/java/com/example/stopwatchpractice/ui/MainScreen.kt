package com.example.stopwatchpractice.ui

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.stopwatchpractice.service.StopwatchService

@ExperimentalAnimationApi
@Composable
fun MainScreen(){
         val context = LocalContext.current
//        val hours by stopwatchService.hours
//        val minutes by stopwatchService.minutes
//        val seconds by stopwatchService.seconds
//        val currentstate by stopwatchService.currentstate


    Column(
        modifier =
        Modifier.fillMaxSize()
            .background(MaterialTheme.colorScheme.surface)
            .padding(30.dp),
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
    ){
//        Column(modifier = ) { }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Preview
@Composable
fun Main(){
    MainScreen()
}