package com.example.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun UserInterface(n1:String,n2:String,n3:String, ns:String,nd:String,nday:String,ndate:String,n4:String,n5:String,n6:String,n7:String,n8:String,n9:String,n10:String, navController: NavController){
    val image = painterResource(R.drawable.background1)
   // val menubar = painterResource(R.drawable.menu_foreground)
    Box(){
        Image(painter = image, contentDescription = null, modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
            contentScale = ContentScale.FillBounds)

        Icon(imageVector = Icons.Filled.Menu, contentDescription = "",
                modifier = Modifier.padding(start = 360.dp, top = 19.dp).size(35.dp)
                )

        Column() {
            Text(text = n1, color = Color.Black,fontSize = 20.sp, fontWeight = FontWeight.SemiBold,modifier = Modifier.padding(start = 180.dp, top = 100.dp))
            Text(text = n2, color = Color.Black,fontSize = 20.sp, fontWeight = FontWeight.SemiBold,modifier = Modifier.padding(start = 180.dp))
            Text(text = n3,  color = Color.Black,modifier = Modifier.padding(start = 15.dp, top = 35.dp))
            Row() {
                Text(text = ns, color = Color.Black,fontSize = 20.sp, fontWeight = FontWeight.Bold,modifier = Modifier.padding(start = 20.dp))
                Text(text = nd, color = Color.Black,fontSize = 20.sp, fontWeight = FontWeight.SemiBold,modifier = Modifier.padding(start = 125.dp))
            }
            Text(text = nday, color = Color.Black,fontSize = 20.sp, fontWeight = FontWeight.W300,modifier = Modifier.padding(start = 30.dp, top = 20.dp))
            Text(text = ndate, color = Color.Black,fontSize = 20.sp, fontWeight = FontWeight.W300,modifier = Modifier.padding(start = 35.dp, top = 1.dp))




            Text(text = n4, color = Color.Black,modifier = Modifier.padding(start = 15.dp))
            Card( shape = RoundedCornerShape(10.dp)) {

            }

            Row() {
                val i1 = painterResource(R.drawable.attendance_foreground)
                val i2 = painterResource(R.drawable.work_foreground)
                val i3 = painterResource(R.drawable.timetable_foreground)


                Column() {
                    Image(
                        painter = i1,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(start = 10.dp)
                            .clickable { navController.navigate("attandance") }
                    )
                    Text(text = n5, color = Color.Black, modifier = Modifier.padding(start = 20.dp, top = 0.dp))
                }
                Column() {
                    Image(painter = i2, contentDescription = null,modifier = Modifier
                        .padding(start = 30.dp)
                        .clickable { navController.navigate("home_work") })
                    Text(text = n6, color = Color.Black, modifier = Modifier.padding(start = 40.dp,top = 0.dp))
                }
                Column() {


                    Image(
                        painter = i3,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(start = 20.dp)
                            .clickable { navController.navigate("timetable") }
                    )
                    Text(text = n7, color = Color.Black, modifier = Modifier.padding(start = 45.dp, top = 0.dp))
                }

            }
            Spacer(modifier = Modifier.padding(10.dp))
            Row() {
                val i4 = painterResource(R.drawable.message_foreground)
                val i5 = painterResource(R.drawable.document_foreground)
                val i6 = painterResource(R.drawable.logout_foreground)
                Column() {
                    Image(
                        painter = i4,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(start = 10.dp)
                            .clickable { navController.navigate("message") }
                    )
                    Text(text = n8, color = Color.Black, modifier = Modifier.padding(start = 33.dp, top = 0.dp))
                }
                Column() {
                    Image(painter = i5, contentDescription = null,modifier = Modifier
                        .padding(start = 29.dp)
                        .clickable { navController.navigate("document") })
                    Text(text = n9, color = Color.Black, modifier = Modifier.padding(start = 50.dp,top = 0.dp))
                }
                Column() {


                    Image(
                        painter = i6,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(start = 20.dp)
                            .clickable { navController.navigate("login_screen") }
                    )
                    Text(text = n10, color = Color.Black, modifier = Modifier.padding(start = 55.dp, top = 0.dp))
                }
            }




        }

    }
}


