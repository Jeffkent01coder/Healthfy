package com.example.healthfy.sceens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.healthfy.data.Disease

@Composable
fun DiseaseItemList(disease: Disease){
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = 2.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Row {
            DiseaseImage(disease = disease)
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .align(alignment = CenterVertically)
                    .fillMaxWidth()
            ) {
                Text(text = disease.title,
                    style = typography.h6
                    )
                Text(text = "View Details",
                    style = typography.caption
                    )
            }
        }
    }
}

@Composable
private fun DiseaseImage(disease: Disease){
    Image(
        painter = painterResource(id = disease.diseaseImage),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(84.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
        )

}