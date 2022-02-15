package com.example.healthfy.sceens

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.healthfy.R
import com.example.healthfy.ui.theme.Shapes

@Composable
fun SplashScreen(){

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF9E7975))
    ) {
        val (banner, title, slogan, btn) = createRefs()
        Image(painter = painterResource(id = R.drawable.f),
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(banner) {

                }
                .fillMaxWidth(fraction = 0.5F),
            contentScale = ContentScale.Crop,
            contentDescription = "Splash Image"

        )

        Text(
            text = "HEALTHFY",
            modifier = Modifier.constrainAs(title){
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(banner.bottom, margin = 30.dp)
            },
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black.copy(alpha = 0.78F)
        )

        val welcomeText = "Your Health is our Concern"
        Text(
            text = welcomeText ,
            modifier = Modifier
                .padding(horizontal = 4.dp)
                .constrainAs(slogan){
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(title.bottom,
                        margin = 20.dp)
                },
            textAlign = TextAlign.Center,
            fontSize = 18.sp,
            fontWeight = FontWeight.Light,
            color = Color.Black.copy(alpha = 0.78F)
        )

        Button(onClick = { },
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth()
                .constrainAs(btn) {
                    top.linkTo(slogan.bottom, margin = 70.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            Text(text = "GET STARTED" )

        }

    }
}

@Composable
@Preview(uiMode = UI_MODE_NIGHT_YES, device = Devices.PIXEL)
fun SplashScreenPrev(){
    SplashScreen()
}