package com.example.login

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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable

fun Login(navController: NavController){
    Scaffold {
        Column() {
            Box(
                modifier = Modifier.padding(start = 20.dp , top = 40.dp , bottom =  0.dp)
            ){
                Text(text = "Lets Sign you in\n" , fontWeight = FontWeight.Bold, fontSize = 35.sp)
                Text(text = "Welcome Back ,\n" +
                        "You have been missed" , fontWeight = FontWeight.Medium, fontSize = 25.sp , modifier = Modifier.padding(top = 55.dp))
            }
            val login = remember{ mutableStateOf("") }
            val password = remember{ mutableStateOf("") }
            Box(modifier = Modifier.padding(start = 20.dp , top = 40.dp , end = 20.dp)) {
                Column() {

                    OutlinedTextField(
                        login.value,
                        { login.value = it },
                        placeholder = { Text("Email ,phone & username") },
                        textStyle = TextStyle(fontSize = 14.sp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(65.dp)
                            .padding(top = 12.dp)
                    )
                    OutlinedTextField(
                        password.value,
                        { password.value = it },
                        placeholder = { Text("Password") },
                        textStyle = TextStyle(fontSize = 14.sp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(65.dp)
                            .padding(top = 12.dp)
                    )
                    Text(
                        text = "Forgot Password ?",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp),
                        textAlign = TextAlign.End

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
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Divider(
                            color = Color.Black,
                            modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .height(1.dp)
                        )
                        Text(text = "or", modifier = Modifier.padding(start = 5.dp, end = 5.dp))
                        Divider(
                            color = Color.Black,
                            modifier = Modifier
                                .height(1.dp)
                        )
                    }
                    Box(

                        contentAlignment = Alignment.Center,
                    ) {
                        Row(
                            modifier = Modifier.padding(top = 25.dp ,  start = 115.dp)
                        ) {
                            Text(text = "Don’t have an account ? ")
                            Text(text = "Register Now " , fontWeight = FontWeight.Bold)
                        }
                    }


                }
            }

        }
    }
}