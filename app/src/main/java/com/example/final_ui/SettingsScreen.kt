package com.example.final_ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun SettingScreen(){
    Column {
        HeaderText()
        Holidays()
    }
}
@Preview
@Composable
fun HeaderText(){
    Text(text = "Settings",

        modifier= Modifier
            .fillMaxWidth()
            .padding(top = 30.dp)
    )
}
@Preview
@Composable
fun Holidays(){
    Card( modifier= Modifier
        .fillMaxWidth()
        .height(150.dp)
        .padding(10.dp)
        //backgroundColor= Color.LightGray,
        //elevation=0.dp,
        //shape= Shape.large
    )
    {
        Row(modifier= Modifier.padding(20.dp),
            horizontalArrangement= Arrangement.SpaceBetween){
            Column {
                Text(text = "Seasonal Cheer",
                    fontSize=16.sp,
                    fontWeight = FontWeight.Bold
                )
                Image(painter = painterResource(id = R.drawable.calender),
                    contentDescription = null,
                    modifier= Modifier.height(120.dp)
                )

                Button(onClick = { /*TODO*/ },

                    //colors = ButtonDefaults.buttonColors(
                    //backgroundColor=PrimaryColor),
                    contentPadding = PaddingValues(horizontal = 20.dp,vertical = 10.dp),
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 0.dp,
                        pressedElevation = 2.dp
                    )
                )
                {
                    Text(text = "Holidays",
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray,

                        )
                }
            }
        }
    }

}