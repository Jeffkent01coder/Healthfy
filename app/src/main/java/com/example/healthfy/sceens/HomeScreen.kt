package com.example.healthfy.sceens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun SearchBar(
    modifier: Modifier= Modifier,
    hint: String = "",
    onSearch: (String) -> Unit = {}
){
    Column(
        Modifier
            .fillMaxHeight()
            .background(Color(0xFFF0D4D1))
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            var text by remember{
                mutableStateOf("")
            }
            var isHintDisplayed by remember{
                mutableStateOf(hint!= "")
            }

            Box(modifier = modifier){
                BasicTextField(value = text
                    , onValueChange ={
                        text = it
                        onSearch(it)
                    },
                    maxLines = 1,
                    singleLine = true,
                    textStyle = TextStyle(color = Color.Black),
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color.White)
                        .shadow(5.dp, CircleShape)
                        .padding(horizontal = 20.dp, vertical = 12.dp)
                        .onFocusChanged {
//                    isHintDisplayed = it != FocusState.Active
                        }
                )
                if (isHintDisplayed){
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
@Preview(device = Devices.PIXEL)
fun SearchBarPrev(){
    SearchBar(
        hint = "Search",
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    )
}






