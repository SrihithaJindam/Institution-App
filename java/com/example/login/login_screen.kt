package com.example.login

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun LoginScreen(s1:String, s2:String,s22:String,s3:String,s33:String,s4:String,s5:String, navController: NavController) {
    val s1 = "Welcome!"
    val s4 = "Forgot Password"
    val s5 = "Don't have an account? Create"
    val context = LocalContext.current
    val Username = remember {
        mutableStateOf(TextFieldValue())
    }
    val Password = remember {
        mutableStateOf(TextFieldValue())
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.loginbg),
            contentDescription = "background_image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )
        Column() {
            // val image = painterResource(R.drawable.ic_launcher_foreground)
            //Image(painter = image, contentDescription = "image")


            Text(
                text = s1,
                fontSize = 40.sp, color = Color.Black, fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 60.dp,
                        top = 150.dp,
                        bottom = 40.dp
                    )
            )

            TextField(label = { Text(text = "Username") },
                value = Username.value,
                onValueChange = { Username.value = it },
            modifier = Modifier.padding(start = 55.dp))
            Spacer(
                modifier = Modifier
                    .height(20.dp)
                    .padding(start = 120.dp)
            )

            TextField(label = { Text(text = "Password") },
                value = Password.value,
                modifier = Modifier.padding(start = 55.dp),
                onValueChange = { Password.value = it })
            Spacer(modifier = Modifier.height(20.dp))




            Button(
                onClick = { navController.navigate("main_screen") },
                colors = ButtonDefaults.buttonColors(Color.White),
                modifier = Modifier
                    .size(width = 399.dp, height = 70.dp)
                    .padding(start = 25.dp, top = 20.dp, end = 25.dp),

                shape = RoundedCornerShape(80)
            ) {
                Text(text = "Login", fontSize = 20.sp, color = Color.Black)
            }


            Text(
                text = s4,
                fontSize = 14.sp, color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .padding(
                        start = 30.dp, top = 5.dp
                    )
            )
            Text(
                text = s5,
                fontSize = 14.sp, color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .padding(
                        start = 20.dp, top = 70.dp
                    )
            )
            Button(
                onClick = { navController.navigate("signup_screen")}, colors = ButtonDefaults.buttonColors(Color.White),
                modifier = Modifier
                    .padding(start = 160.dp), shape = RoundedCornerShape(80)
            ) {
                Text(text = "Create", fontSize = 19.sp, color = Color.Black)


            }
        }
    }
}


