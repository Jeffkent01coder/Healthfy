package com.example.healthfy.sceens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.healthfy.R

@Composable
fun DiseaseScreen() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .scrollable(scrollState, enabled = true, orientation = Orientation.Vertical)
            .background(Color(0xFFF0D4D1))
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center

        ) {
            Image(
                painter = painterResource(id = R.drawable.left),
                contentDescription = "Go Back",
                modifier = Modifier.height(48.dp),
            )

            Spacer(
                modifier = Modifier
                    .weight(0.5F)
            )

            Box(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(16.dp))
                    .clickable { }
                    .background(Color(0XFF9E7975))
                    .size(width = 300.dp, height = 40.dp),

                ) {
                Text(
                    text = "HYPERTENSION",
                    fontSize = 25.sp,
                    color = Color.White,
                    modifier = Modifier
                        .align(Alignment.Center),
                    textAlign = TextAlign.Center
                )
            }
        }

        CardExample(image = painterResource(id = R.drawable.dis), text = "Definition and causes" )
        Spacer(modifier = Modifier.height(16.dp))
        CardExample(image = painterResource(id = R.drawable.sin), text = "Signs And Symptoms" )
        Spacer(modifier = Modifier.height(16.dp))
        CardExample(image = painterResource(id = R.drawable.terr), text = "Treatment" )
        Spacer(modifier = Modifier.height(16.dp))
        CardExample(image = painterResource(id = R.drawable.di), text = "Preferred diet and Recipe" )


    }
}

@Composable
fun CardExample(image: Painter, text: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, top = 0.dp, end = 15.dp, bottom = 0.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box(
            modifier = Modifier
                .height(143.dp)
        ) {
            Image(
                painter = image,
                contentDescription = "Get help from a Medic",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop

            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {

                Text(
                    text = text,
                    style = TextStyle(color = Color.Black),
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }

        }

    }
}

@Composable
@Preview(device = Devices.PIXEL)
fun DiseaseScreenPrev() {
    DiseaseScreen()

}
