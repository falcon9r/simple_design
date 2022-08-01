package com.example.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter

@Composable
fun Welcome(navController: NavController){
        Scaffold(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xE5E5E5)),
        ) {
        Column(
            modifier = Modifier.padding(top = 150.dp , start = 0.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
           Image(bitmap = ImageBitmap.imageResource(id = R.drawable.first), contentDescription = null)
            Text(text = "Team work all" , fontWeight = FontWeight.Bold , modifier = Modifier
                .fillMaxWidth(1f)
                .padding(top = 30.dp) , textAlign = TextAlign.Center , fontSize = 34.sp)
            Box(modifier =Modifier.padding(start = 50.dp , end = 50.dp , top = 20.dp) ) {
                Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.  Id potenti nisl tellus vestibulum dictum luctus cum habitasse augue. Convallis vitae, dictum justo, iaculis id. Cras a ac augue netus egestas semper varius facilisis id. ", style = TextStyle(textIndent =  TextIndent(0.sp , 0.sp)))
            }
            Row (
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.padding(top = 70.dp)
                    ){
                Button(onClick = {
                    navController.navigate("login")
                } , shape = RoundedCornerShape(topEnd = 0.dp, bottomEnd = 0.dp, topStart = 15.dp, bottomStart = 15.dp), colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black, contentColor = Color.White) , modifier = Modifier.width(165.dp).height(50.dp)) {
                    Text(text = "Sign in" , fontSize = 22.sp , fontWeight = FontWeight.Bold)
                }
                Button(onClick = {
                    navController.navigate("register")
                }, shape = RoundedCornerShape(topEnd = 15.dp, bottomEnd = 15.dp, topStart = 0.dp, bottomStart = 0.dp) , modifier = Modifier.width(165.dp).height(50.dp)) {
                    Text(text = "Register" , fontSize = 22.sp , fontWeight = FontWeight.Bold)
                }
            }
        }
        }
}