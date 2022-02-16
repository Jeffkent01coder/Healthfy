package com.example.healthfy.sceens

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.healthfy.R


@Composable
fun SplashScreen() {

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF9E7975))
    ) {
        val (banner, title, slogan, btn) = createRefs()
        Image(painter = painterResource(id = R.drawable.f),
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
                .constrainAs(banner) {

                }
                .fillMaxWidth(fraction = 0.5F),
            contentScale = ContentScale.Crop,
            contentDescription = "Splash Image"

        )

        Text(
            text = "HEALTHFY",
            modifier = Modifier.constrainAs(title) {
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
            text = welcomeText,
            modifier = Modifier
                .padding(horizontal = 4.dp)
                .constrainAs(slogan) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(
                        title.bottom,
                        margin = 20.dp
                    )
                },
            textAlign = TextAlign.Center,
            fontSize = 18.sp,
            fontWeight = FontWeight.Light,
            color = Color.Black.copy(alpha = 0.78F)
        )

        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(16.dp))
                .clickable { }
                .background(Color(0XFFE35F4B))
                .size(width = 150.dp, height = 40.dp)
                .constrainAs(btn) {
                    top.linkTo(slogan.bottom, margin = 90.dp)
                    start.linkTo(parent.start, margin = 16.dp)
                }
        ) {
            Text(
                text = "GET STARTED",
                modifier = Modifier
                    .align(Alignment.Center),
                textAlign = TextAlign.Center
            )
        }
    }

    FeaturedCircularProgressIndicator()
}

@Composable
fun FeaturedCircularProgressIndicator() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start
    ) {
        CircularProgressIndicator(
            progress = 0.8f,
            modifier = Modifier.padding(8.dp),
            color = Color.Green,
            strokeWidth = 2.dp
        )
    }
}


@Composable
@Preview(uiMode = UI_MODE_NIGHT_YES, device = Devices.PIXEL)
fun SplashScreenPrev() {
    SplashScreen()
}