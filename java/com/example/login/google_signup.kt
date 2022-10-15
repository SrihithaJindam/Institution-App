package com.example.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Greetingtext(name: String,name2: String,name3: String,name4:String,name5:String, navController: NavController) {
    val image = painterResource(R.drawable._3_pro___7)
    val image1 = painterResource(R.drawable.google)
    Image(painter = image, contentScale = ContentScale.FillBounds, contentDescription = null, modifier = Modifier.fillMaxSize())
    Image(
        painter = image1, contentDescription = null, modifier = Modifier
            .padding( top = 50.dp, start = 115.dp)
    )
    Text(
        text = name,
        style = TextStyle(fontSize = 27.sp),
        modifier = Modifier.padding(start = 160.dp, top = 150.dp)
    )
    Text(text = name2, fontSize = 17.sp, modifier = Modifier.padding(start = 100.dp, top = 200.dp))
    Text(
        text = name3,
        style = TextStyle(color = Color.Blue),
        fontSize = 14.sp,
        modifier = Modifier.padding(start = 64.dp, top = 310.dp)
    )
    Text(text = name4, fontSize = 13.sp, modifier = Modifier.padding(start = 60.dp, top = 380.dp))
    Text(
        text = name5,
        style = TextStyle(color = Color.Blue),
        fontSize = 18.sp,
        modifier = Modifier.padding(start = 60.dp, top = 470.dp)
    )

    Column(modifier = Modifier.padding(start = 60.dp, top = 250.dp)) {
        val EmailOrPhone = remember {
            mutableStateOf(TextFieldValue())
        }
        TextField(label = { Text(text = "Email Or Phone") },
            value = EmailOrPhone.value,
            onValueChange = { EmailOrPhone.value = it })
    }
    Button(
        onClick = { navController.navigate("main_screen") }, shape = RoundedCornerShape(15),
        modifier = Modifier
            .padding(start = 250.dp, top = 457.dp, bottom = 160.dp, end = 60.dp)
    )
    {
        Text(
            text = "Next",
            color = Color.White
        )
    }


}
