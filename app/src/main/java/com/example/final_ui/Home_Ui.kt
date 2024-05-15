package com.example.final_ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.final_ui.ui.theme.Final_uiTheme
import kotlinx.coroutines.delay

@SuppressLint("CustomSplashScreen")
class SplashActivity:ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Final_uiTheme {
               SplashScreen()
            }
        }
    }
}
@Preview
@Composable
private fun SplashScreen(){
    LaunchedEffect(key1 = true){
        delay(2000)
    }
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF2196F3)), contentAlignment = Alignment.Center){
        Image(painter = painterResource(id =R.drawable.img ), contentDescription =null )
    }
}