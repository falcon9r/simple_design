package com.example.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Register(navController: NavController){
   Scaffold {
       Column() {
           Box(
               modifier = Modifier.padding(start = 20.dp , top = 40.dp)
           ){
               Text(text = "Lets Register\n" +
                       "Account" , fontWeight = FontWeight.Bold, fontSize = 35.sp)
           }
           Box(
               modifier = Modifier.padding(start = 20.dp , top = 10.dp)
           ){
               Text(text = "Hello user , you have \n" +
                        "a greatful journey" , fontWeight = FontWeight.Medium, fontSize = 25.sp)
           }
           val name = remember{ mutableStateOf("") }
           val buissness_name = remember{ mutableStateOf("") }
           val phone = remember{ mutableStateOf("") }
           val email = remember{ mutableStateOf("") }
           val password = remember{ mutableStateOf("") }
           Box(modifier = Modifier.padding(start = 20.dp , top = 10.dp , end = 20.dp)) {
               Column {

               OutlinedTextField(
                   name.value,
                   { name.value = it },
                   placeholder = { Text("Name") },
                   textStyle = TextStyle(fontSize = 14.sp),
                   modifier = Modifier
                       .fillMaxWidth()
                       .height(65.dp)
                       .padding(top = 12.dp)
               )
               OutlinedTextField(
                   buissness_name.value,
                   { buissness_name.value = it },
                   placeholder = { Text("Buissness name") },
                   textStyle = TextStyle(fontSize = 14.sp),
                   modifier = Modifier
                       .fillMaxWidth()
                       .height(65.dp)
                       .padding(top = 12.dp)
               )
               OutlinedTextField(
                   phone.value,
                   { phone.value = it },
                   placeholder = { Text("Phone") },
                   textStyle = TextStyle(fontSize = 14.sp),
                   modifier = Modifier
                       .fillMaxWidth()
                       .height(65.dp)
                       .padding(top = 12.dp)
               )
               OutlinedTextField(
                   email.value,
                   { email.value = it },
                   placeholder = { Text("Email") },
                   textStyle = TextStyle(fontSize = 14.sp),
                   modifier = Modifier
                       .fillMaxWidth()
                       .height(65.dp)
                       .padding(top = 12.dp)
               )
               OutlinedTextField(
                   password.value,
                   { password.value = it },
                   placeholder = { Text( text = "Password") },
                   textStyle = TextStyle(fontSize = 14.sp),
                   modifier = Modifier
                       .fillMaxWidth()
                       .height(65.dp)
                       .padding(top = 12.dp)
               )
                   Box(
                       contentAlignment = Alignment.Center,
                   ) {
                       Button(
                           onClick = { /*TODO*/ },
                           modifier = Modifier
                               .padding(top = 40.dp)
                               .fillMaxWidth()
                               .height(50.dp),
                           colors = ButtonDefaults.buttonColors(contentColor = Color.White , backgroundColor = Color.Black)


                       ) {
                           Text(
                               text = "Sign in",
                               fontSize = 16.sp
                           )
                       }
                   }

                   Box(

                       contentAlignment = Alignment.Center,
                   ) {
                       Row(
                           modifier = Modifier.padding(top = 25.dp ,  start = 115.dp)
                       ) {
                           Text(text = "Already  have an account ? ")
                           Text(text = "Login" , fontWeight = FontWeight.Bold)

                       }
                   }

               }
           }

       }
   }
}