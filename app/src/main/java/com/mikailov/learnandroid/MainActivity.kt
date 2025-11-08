package com.mikailov.learnandroid

import android.R.attr.fontWeight
import android.database.Cursor
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily.Companion.Cursive
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Text( modifier = Modifier.padding(start = 30.dp, top = 16.dp,end = 25.dp,bottom = 32.dp). background(color = Color.Red). padding(start = 30.dp,top = 16.dp,end = 25.dp,bottom = 32.dp). width(width = 60.dp),text = "Hello world", fontWeight = FontWeight.Bold, color = Color.Green, fontSize = 20.sp, fontFamily = Cursive


            )

        }



    }
}