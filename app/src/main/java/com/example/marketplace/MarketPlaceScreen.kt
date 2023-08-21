package com.example.marketplace

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.marketplace.ui.theme.LightGreen
import com.example.marketplace.ui.theme.TextBackground

@Composable
fun MarketPlaceScreen(navController: NavController){
    Box(modifier = Modifier.fillMaxSize()) {
        Column() {

            Column(modifier = Modifier
                .fillMaxWidth()
                .background(LightGreen)
                .padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "WhatsApp Marketplace", fontSize = 20.sp)
                Text(text = "Where Connections Spark Commerce", fontSize = 12.sp)
            }
            LazyColumn(modifier = Modifier.fillMaxHeight(0.9f)) {
                items(2) {
                    Column(modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .padding(10.dp)
                        .background(TextBackground, RoundedCornerShape(24.dp))
                        .padding(15.dp)) {
                        Text(text = "Athul", fontSize = 15.sp, fontWeight = FontWeight.SemiBold)
                        Spacer(modifier = Modifier.padding(5.dp))
                        Image(painter = painterResource(id = R.drawable.miles), contentDescription = "spidey", modifier = Modifier.fillMaxWidth())
                        Spacer(modifier = Modifier.padding(5.dp))
                        Text("Miles Morales Poster", fontSize = 24.sp)
                        Text(text = "Miles Morales in his iconic black and red Spider-Man suit.", fontSize = 15.sp)
                        Text(text = "Rs. 670", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.padding(5.dp))
                        Button( colors = ButtonDefaults.buttonColors(containerColor = LightGreen, contentColor = Color.White),modifier = Modifier.fillMaxWidth(), onClick = { } ) {
                            Text(text = "Buy")
                        }
                    }

                    Column(modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .padding(10.dp)
                        .background(TextBackground, RoundedCornerShape(24.dp))
                        .padding(15.dp)) {
                        Text(text = "Athul", fontSize = 15.sp, fontWeight = FontWeight.SemiBold)
                        Spacer(modifier = Modifier.padding(5.dp))
                        Image(painter = painterResource(id = R.drawable.puppies), contentDescription = "spidey", modifier = Modifier.fillMaxWidth())
                        Spacer(modifier = Modifier.padding(5.dp))
                        Text("Labrador Puppies", fontSize = 24.sp)
                        Text(text = "2 months old certified labrador puppies for sale", fontSize = 15.sp)
                        Text(text = "Rs. 12,000", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.padding(5.dp))
                        Button( colors = ButtonDefaults.buttonColors(containerColor = LightGreen, contentColor = Color.White),modifier = Modifier.fillMaxWidth(), onClick = { } ) {
                            Text(text = "Buy")
                        }
                    }
                }
            }

        }



        Button(colors = ButtonDefaults.buttonColors(containerColor = LightGreen, contentColor = Color.White),modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .align(Alignment.BottomCenter), onClick = { } ) {
            Text(text = "Sell Something")
        }








    }
}