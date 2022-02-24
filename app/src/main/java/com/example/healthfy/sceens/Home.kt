package com.example.healthfy.sceens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.healthfy.data.DataProvider

@Composable
fun Home() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color(color = 0xFFF0D4D1))){

        Column {
            Header()
            Body()
        }

    }


}

@Composable
fun Header(
    hint: String = "Search",
    onSearch: (String) -> Unit = {}
) {

    Box(  modifier = Modifier
        .fillMaxWidth()
        .height(150.dp)
        .clip(shape = RoundedCornerShape(bottomStart = 24.dp, bottomEnd = 24.dp))
        .background(color = Color(0XFF9E7975))) {

        Column(modifier = Modifier
            .height(100.dp)
            .fillMaxWidth()) {
            Text(
                text = "HEALTH CONDITIONS",
                fontSize = 25.sp,
                modifier = Modifier
                    .padding(10.dp),
                color = Color.White
            )

            var text by remember {
                mutableStateOf("")
            }
            val isHintDisplayed by remember {
                mutableStateOf(hint != "")
            }


            Box(  modifier = Modifier) {
                BasicTextField(value = text, onValueChange = {
                    text = it
                    onSearch(it)
                },

                    maxLines = 1,
                    singleLine = true,
                    textStyle = TextStyle(color = Color.Black),
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(24.dp))
                        .fillMaxWidth()
                        .background(color = Color.White)
                        // .shadow(5.dp, CircleShape)
                        .padding(horizontal = 20.dp, vertical = 15.dp)
                        .onFocusChanged { focusState ->
                            isHintDisplayed != focusState.isFocused
                        },

                )
                if (isHintDisplayed) {
                    Text(
                        text = hint,
                        color = Color.LightGray,
                        modifier = Modifier.padding(horizontal = 20.dp, vertical = 12.dp)

                    )
                }
            }


        }

    }


}


@Composable
fun Body() {

    val sickness = remember{ DataProvider.diseaseList}
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ){
        items(
            items = sickness,
            itemContent = {
                DiseaseItemList(disease = it)
            }
        )

    }

}


@Composable
@Preview(device = Devices.PIXEL)
fun HomePrev(){
   Home()
}