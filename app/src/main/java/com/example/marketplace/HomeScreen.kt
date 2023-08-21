package com.example.marketplace

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Search
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.marketplace.ui.theme.Background
import com.example.marketplace.ui.theme.Green
import com.example.marketplace.ui.theme.TextColor

@Composable
fun HomeScreen(navController: NavController) {
    var selected by remember { mutableStateOf("1") }

    Column() {

        Column(modifier = Modifier.background(Background)) {

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp), horizontalArrangement = Arrangement.SpaceBetween) {

                Text("WhatsApp", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = TextColor)

                Row() {
                    Icon(Icons.Rounded.Search, contentDescription = null)
                    Spacer(modifier = Modifier.padding(7.dp))
                    Icon(Icons.Rounded.Lock, contentDescription = null)
                    Spacer(modifier = Modifier.padding(7.dp))
                    Icon(Icons.Rounded.Menu, contentDescription = null)
                }
            }


            Row(modifier = Modifier
                .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {

                Box(modifier = Modifier
                    .height(50.dp)
                    .weight(1f)
                    .background(Background)
                    .clickable { selected = "1" }) {
                    Text(text = "Chats", modifier = Modifier.align(Alignment.Center), fontWeight = FontWeight.Bold, color = if (selected == "1") { Green } else { TextColor })
                    Box(modifier = Modifier
                        .height(3.dp)
                        .fillMaxWidth()
                        .background(
                            if (selected == "1") {
                                Green
                            } else {
                                Background
                            }
                        )
                        .align(Alignment.BottomCenter))
                }

                Box(modifier = Modifier
                    .height(50.dp)
                    .weight(1f)
                    .background(Background)
                    .clickable { selected = "2" }) {
                    Text(text = "Status", modifier = Modifier.align(Alignment.Center), fontWeight = FontWeight.Bold, color = if (selected == "2") { Green } else { TextColor })
                    Box(modifier = Modifier
                        .height(3.dp)
                        .fillMaxWidth()
                        .background(
                            if (selected == "2") {
                                Green
                            } else {
                                Background
                            }
                        )
                        .align(Alignment.BottomCenter))
                }

                Box(modifier = Modifier
                    .height(50.dp)
                    .weight(1f)
                    .background(Background)
                    .clickable { selected = "3" }) {
                    Text(text = "Calls", modifier = Modifier.align(Alignment.Center), fontWeight = FontWeight.Bold, color = if (selected == "3") { Green } else { TextColor })
                    Box(modifier = Modifier
                        .height(3.dp)
                        .fillMaxWidth()
                        .background(
                            if (selected == "3") {
                                Green
                            } else {
                                Background
                            }
                        )
                        .align(Alignment.BottomCenter))
                }

            }

        }

        if(selected == "1") {
            Column {
                Box(Modifier.clickable { navController.navigate("chat_screen") }) {
                    GroupChat()
                }

                Box(Modifier.clickable {  }) {
                    GroupChat()
                }

                Box(Modifier.clickable {  }) {
                    GroupChat()
                }

                Box(Modifier.clickable {  }) {
                    GroupChat()
                }

                Box(Modifier.clickable {  }) {
                    GroupChat()
                }

            }
        }
    }
}

@Composable
fun GroupChat() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp, 15.dp), horizontalArrangement = Arrangement.SpaceBetween) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id = R.drawable.ic_launcher_background),modifier = Modifier
                .size(50.dp)
                .clip(CircleShape), contentDescription = null)
            Spacer(modifier = Modifier.padding(8.dp))
            Column() {
                Text("Group 1", color = Color.White, fontWeight = FontWeight.Bold)
                Text("Zen: Hahah", color = TextColor, fontWeight = FontWeight.SemiBold)
            }
        }
        Text("3:50 pm", color = TextColor, fontSize = 13.sp)
    }
}