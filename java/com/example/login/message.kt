package com.example.login.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.login.R

@Composable
fun Notifications(h1:String,h2:String,h3:String,h4:String,h5:String, navController: NavController){
    Box(){
        val imagebg = painterResource(R.drawable.background)
        Image(painter = imagebg, contentDescription = null, modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
            contentScale = ContentScale.FillBounds)
        Column() {
            Text(text = h1, fontSize = 38.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 20.dp, top = 30.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, top = 40.dp, end = 10.dp), shape = RoundedCornerShape(10.dp),
                backgroundColor = Color.White
            ) {
                Box() {
                    Column() {
                        Text(text = h2,fontSize = 18.sp, fontWeight = FontWeight.ExtraBold, modifier = Modifier.padding(start = 10.dp, top = 4.dp))
                        Text(text = h3,fontSize = 18.sp, fontWeight = FontWeight.W400, modifier = Modifier.padding(start = 10.dp, top = 4.dp))


                    }
                }

            }
            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, top = 30.dp, end = 10.dp), shape = RoundedCornerShape(10.dp)) {
                Box() {
                    Column() {
                        Text(text = h4,fontSize = 18.sp, fontWeight = FontWeight.ExtraBold, modifier = Modifier.padding(start = 10.dp, top = 4.dp))
                        Text(text = h5,fontSize = 18.sp, fontWeight = FontWeight.W400, modifier = Modifier.padding(start = 10.dp, top = 4.dp))


                    }
                }

            }

        }
    }
}