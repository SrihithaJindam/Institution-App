package com.example.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Greetingimage(name: String,name3:String,name2:String,navController: NavController) {
    Box(){
        val image= painterResource(R.drawable.homeworkbg)
        Image(painter = image, contentScale = ContentScale.FillBounds, contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight())
        val Fullname = remember { mutableStateOf(TextFieldValue()) }
        val Username = remember { mutableStateOf(TextFieldValue()) }
        val Email=     remember {
            mutableStateOf(TextFieldValue())}
        val Password = remember { mutableStateOf(TextFieldValue()) }
        Column() {
            Text(
                text = name,
                style = TextStyle(fontWeight = FontWeight.ExtraBold),
                fontSize = 29.sp,
                modifier = Modifier
                    .padding(start = 30.dp, top = 60.dp)
            )
            Button(
                onClick = {navController.navigate("google_signup") },
                modifier = Modifier
                    .size(width = 399.dp, height = 70.dp)
                    .padding(start = 25.dp, top = 20.dp, end = 25.dp),

                shape = RoundedCornerShape(20)
            ) {
                Text(text = "Sign up with Google", fontSize = 20.sp, color = Color.White)

            }
            Text(text = name3, modifier = Modifier.padding(start = 35.dp,top = 20.dp))
            Spacer(modifier = Modifier.height(20.dp))

            TextField(
                label = { Text(text = "Fullname") },
                value = Fullname.value, modifier = Modifier.padding(start = 50.dp),
                onValueChange = { Fullname.value = it })
            Spacer(
                modifier = Modifier
                    .height(20.dp)
                    .padding(start = 120.dp)
            )

            TextField(
                label = { Text(text = "Username") },
                value = Username.value, modifier = Modifier.padding(start = 50.dp),
                onValueChange = { Username.value = it })
            Spacer(
                modifier = Modifier
                    .height(20.dp)
                    .padding(start = 120.dp)
            )
            TextField(
                label = { Text(text = "Email") },
                value = Email.value, modifier = Modifier.padding(start = 50.dp),
                onValueChange = {Email.value = it })
            Spacer(
                modifier = Modifier
                    .height(20.dp)
                    .padding(start = 120.dp)
            )
            TextField(
                label = { Text(text = "Password") },
                value = Password.value, modifier = Modifier.padding(start = 50.dp),
                onValueChange = {
                    Password.value = it })
            Spacer(
                modifier = Modifier
                    .height(10.dp)
                    .padding(start = 120.dp)
            )
            Text(text = name2, fontSize = 16.sp, modifier = Modifier.padding(start = 50.dp))
            Button(
                onClick = { navController.navigate("login_screen")},
                modifier = Modifier
                    .padding(start = 70.dp, top = 20.dp)
                    .size(width = 240.dp, height = 50.dp)
                ,

                shape = RoundedCornerShape(30)
            ) {
                Text(text = "Create an Account", fontSize = 20.sp, color = Color.White)

            }

        }
    }
}
