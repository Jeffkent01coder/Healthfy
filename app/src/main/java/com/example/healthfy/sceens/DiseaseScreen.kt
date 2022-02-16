package com.example.healthfy.sceens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Yellow
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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF0D4D1))
        ) {
            Row(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center

            ) {
                Image(
                    painter = painterResource(id = R.drawable.left) ,
                    contentDescription = "Go Back",
                    modifier = Modifier.height(48.dp),
                )

                Spacer(modifier = Modifier
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

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, top = 0.dp,end = 15.dp,bottom = 0.dp),
                shape = RoundedCornerShape(15.dp),
                elevation = 5.dp
            ) {
                Box(modifier = Modifier
                    .height(143.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.he),
                        contentDescription = "Get help from a Medic",
                        contentScale = ContentScale.Fit

                    )
                    Box(modifier = Modifier
                        .fillMaxSize()
                        .padding(12.dp),
                        contentAlignment = Alignment.BottomStart
                    ){
                        Text(text = "Contact Us",
                            style = TextStyle(color = Color.Black),
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp)
                    }

                }

            }

            Spacer(modifier = Modifier.height(15.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, top = 0.dp,end = 15.dp,bottom = 0.dp),
                shape = RoundedCornerShape(15.dp),
                elevation = 5.dp
            ) {
                Box(modifier = Modifier
                    .height(143.dp)) {
                    Image(painter = painterResource(id = R.drawable.how),
                        contentDescription = "Get help from a Medic",
                        contentScale = ContentScale.FillBounds

                    )
                    Box(modifier = Modifier
                        .fillMaxSize()
                        .padding(12.dp),
                        contentAlignment = Alignment.BottomStart
                    ){
                        Text(text = "How To Use The App",
                            style = TextStyle(color = Color.Black),
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp)
                    }

                }

            }

            Spacer(modifier = Modifier.height(15.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, top = 0.dp,end = 15.dp,bottom = 0.dp),
                shape = RoundedCornerShape(15.dp),
                elevation = 5.dp
            ) {
                Box(modifier = Modifier
                    .height(143.dp)) {
                    Image(painter = painterResource(id = R.drawable.ab),
                        contentDescription = "Get help from a Medic",
                        contentScale = ContentScale.FillBounds

                    )
                    Box(modifier = Modifier
                        .fillMaxSize()
                        .padding(12.dp),
                        contentAlignment = Alignment.BottomStart
                    ){
                        Text(text = "About Us",
                            style = TextStyle(color = Color.Black),
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp)
                    }

                }

            }

            Spacer(modifier = Modifier.height(15.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, top = 0.dp,end = 15.dp,bottom = 0.dp),
                shape = RoundedCornerShape(15.dp),
                elevation = 5.dp
            ) {
                Box(modifier = Modifier
                    .height(143.dp)) {
                    Image(painter = painterResource(id = R.drawable.ab),
                        contentDescription = "Get help from a Medic",
                        contentScale = ContentScale.FillBounds

                    )
                    Box(modifier = Modifier
                        .fillMaxSize()
                        .padding(12.dp),
                        contentAlignment = Alignment.BottomStart
                    ){
                        Text(text = "About Us",
                            style = TextStyle(color = Color.Black),
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp)
                    }

                }

            }

        }
    }



@Composable
@Preview(device = Devices.PIXEL)
fun DiseaseScreenPrev(){
    DiseaseScreen()

}
