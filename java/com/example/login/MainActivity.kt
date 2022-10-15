package com.example.login

import android.os.Bundle
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.login.ui.theme.LoginTheme
import com.example.login.ui.theme.Notifications

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Navigation()
                }
            }
        }
    }
}



@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash_screen" ) {
        composable("splash_screen") {
            SplashScreen(navController = navController)
        }
        composable("login_screen") {
            LoginScreen(s1 = String(), s2 = String(), s22 = String(), s3 = String(), s33 = String(), s4 = String(), s5 = String(), navController = navController)
        }
        composable("main_screen") {
            UserInterface(n1 = "Name:*********", n2 = "Roll No:20Wj1Axxxx", n3 = "_____________________________________________________", ns = "Select Date", nd = "October 2022", nday = "Mon    Tue    Wed    Thu     Fri     Sat    Sun", ndate = "12       13       14       15      16      17      18", n4 = "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -", n5 = "Attendance", n6 = "Home Work", n7 = "Time Table",n8 = "Message", n9 = "Document", n10 = "Logout", navController = navController)
        }
        composable("message") {
            Notifications(h1 = "Messages", h2 = "Director-GNU", h3 = "Welcome to Guru Nanak University !", h4 = "HOD-CSE", h5 = "Your project work has been sent to your mails.",navController = navController)
        }
        composable("attandance") {
            Attandance(navController = navController)
        }
        composable("timetable") {
            TimeTable(navController = navController)
        }
        composable("document") {
            Document(navController = navController)
        }
        composable("home_work") {
            HomeWork(navController = navController)
        }
        composable("signup_screen") {
            Greetingimage("Login to Signup", name3 = "_____________________ or ______________________", name2 = " ☑  Create an account means you are okay with Term's and service, private policy.",navController = navController)
        }
        composable("google_signup") {
            Greetingtext("Sign in","with your google Account","Forget email?","Not your computer? Use Guest mode to sign in privately.Learn more","Create Account", navController = navController)
        }

    }
}