package com.example.healthfy.sceens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.healthfy.R


@Composable
fun HelpScreen(){
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box(modifier = Modifier
            .height(200.dp)) {
            Image(painter = painterResource(id = R.drawable.f),
                contentDescription = "Get help from a Medic",
                contentScale = ContentScale.FillBounds

            )
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ){
                Text(text = "Get Help From A Medical Practitioner",
                    style = TextStyle(color = Color.Black),
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp)
            }

        }

    }



}

@Composable
@Preview(device = Devices.PIXEL)
fun HelpScreenPrev(){
    HelpScreen()
}