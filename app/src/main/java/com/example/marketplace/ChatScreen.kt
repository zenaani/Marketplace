package com.example.marketplace

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Face
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material.icons.rounded.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.marketplace.ui.theme.Background
import com.example.marketplace.ui.theme.Green
import com.example.marketplace.ui.theme.Purple40
import com.example.marketplace.ui.theme.TextColor

@Composable
fun ChatScreen(navController: NavController) {
    var visible by remember { mutableStateOf("0") }
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {

        //Top Bar
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Background)
            .padding(12.dp, 15.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {

            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Rounded.ArrowBack, contentDescription = null, modifier = Modifier.clickable { navController.navigate("home_screen") })
                Spacer(modifier = Modifier.padding(3.dp))
                Image(painter = painterResource(id = R.drawable.dp),modifier = Modifier
                    .size(30.dp)
                    .clip(CircleShape), contentDescription = null)
                Spacer(modifier = Modifier.padding(5.dp))
                Text(text = "Group 1", fontWeight = FontWeight.Bold, color = Color.White, fontSize = 20.sp)
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Rounded.Phone, contentDescription = null)
                Spacer(modifier = Modifier.padding(8.dp))
                Icon(Icons.Rounded.ShoppingCart, contentDescription = null)
                Spacer(modifier = Modifier.padding(8.dp))
                Icon(painterResource(id = R.drawable.threedot), contentDescription = null, modifier = Modifier.size(20.dp))
            }
        }

        Column() {

            //Attach Box
            if (visible == "1") {
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .background(Background, RoundedCornerShape(12.dp))
                    .padding(30.dp)) {

                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                        AttachRound()
                        AttachRound()
                        AttachRound()
                    }

                    Spacer(modifier = Modifier.padding(10.dp))

                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                        AttachRound()
                        AttachRound()
                        AttachRound()
                    }

                    Spacer(modifier = Modifier.padding(10.dp))

                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                        AttachRound()
                        AttachRound()

                        Box(modifier = Modifier
                            .size(70.dp)
                            .background(Purple40, CircleShape)
                            .clickable { navController.navigate("market_place_screen") }) {
                            Icon(Icons.Rounded.ShoppingCart, contentDescription = "market", modifier = Modifier
                                .align(Alignment.Center)
                                .size(25.dp))
                        }
                    }

                }
            }

            Row(verticalAlignment = Alignment.CenterVertically) {

                Row(modifier = Modifier
                    .fillMaxWidth(0.87f)
                    .padding(7.dp)
                    .background(Background, RoundedCornerShape(50.dp))
                    .padding(12.dp),horizontalArrangement = Arrangement.SpaceBetween) {

                    Row() {
                        Icon(Icons.Rounded.Face, contentDescription = null)
                        Spacer(modifier = Modifier.padding(3.dp))
                        Text("Message")
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(painterResource(id = R.drawable.attach), contentDescription = null, modifier = Modifier.size(20.dp).clickable { visible = "1" })
                        Spacer(modifier = Modifier.padding(8.dp))
                        Icon(painterResource(id = R.drawable.rupee), contentDescription = null)
                        Spacer(modifier = Modifier.padding(8.dp))
                        Icon(painterResource(id = R.drawable.camera), contentDescription = null, modifier = Modifier.size(20.dp))

                    }

                }

                Box(modifier = Modifier
                    .fillMaxWidth(1f)
                    .background(Green, CircleShape)
                    .padding(12.dp)) {
                    Icon(Icons.Rounded.Person, contentDescription = null)
                }

            }

        }



    }

}

@Composable
fun AttachRound() {
    Box(modifier = Modifier
        .size(70.dp)
        .background(Green, CircleShape)) {
        Icon(painterResource(id = R.drawable.camera), contentDescription = null, modifier = Modifier
            .align(Alignment.Center)
            .size(25.dp))
    }
}