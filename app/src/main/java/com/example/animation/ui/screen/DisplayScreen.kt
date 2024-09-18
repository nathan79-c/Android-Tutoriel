package com.example.animation.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun VeticalComposable(modifier: Modifier = Modifier){

    Column (
        modifier = modifier
    ){
        Text(
            text = "Firt ELement",
            color = Color.White,
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
        )
        Text(
        text = "Second ELement",
            color = Color.White,
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
        )
        Text(
            text = "treethy ELement",
            color = Color.White,
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
        )
    }
}
@Composable
fun HorizontalComposable(modifier:Modifier = Modifier){
    Row(
        modifier =modifier
    ) {
        Text(
            text = "Firt ELement",
            color = Color.White,
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
        )
        Text(
            text = "Second ELement",
            color = Color.White,
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
        )
        Text(
            text = "treethy ELement",
            color = Color.White,
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
        )
    }
}

@Preview
@Composable
fun VerticalComposablePreview(){
    VeticalComposable()
}

@Preview
@Composable
fun HorizontalComposablePreview(){
    HorizontalComposable()

}