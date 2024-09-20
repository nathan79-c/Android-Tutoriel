package com.example.animation.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun VeticalComposable(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(color = Color(0xFFBBDEFB))
            .border(2.dp, Color(0xFF1976D2), shape = RoundedCornerShape(10.dp))
            .padding(16.dp)
    ) {
        Text(
            text = "First Element",
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = modifier
                .background(color = Color(0xFF1976D2), shape = RoundedCornerShape(8.dp))
                .padding(16.dp)
                .fillMaxWidth(),
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Second Element",
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = modifier
                .background(color = Color(0xFF1976D2), shape = RoundedCornerShape(8.dp))
                .padding(16.dp)
                .fillMaxWidth(),
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Third Element",
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = modifier
                .background(color = Color(0xFF1976D2), shape = RoundedCornerShape(8.dp))
                .padding(16.dp)
                .fillMaxWidth(),
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
        )
    }
}

@Composable
fun HorizontalComposable(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(color = Color(0xFFC8E6C9))
            .border(2.dp, Color(0xFF388E3C), shape = RoundedCornerShape(10.dp))
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Text(
            text = "First Element",
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = modifier
                .background(color = Color(0xFF388E3C), shape = RoundedCornerShape(8.dp))
                .padding(16.dp),
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
        )
        Text(
            text = "Second Element",
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = modifier
                .background(color = Color(0xFF388E3C), shape = RoundedCornerShape(8.dp))
                .padding(16.dp),
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
        )
        Text(
            text = "Third Element",
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = modifier
                .background(color = Color(0xFF388E3C), shape = RoundedCornerShape(8.dp))
                .padding(16.dp),
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
        )
    }
}

@Composable
fun BoxAligneement(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(color = Color(0xFFFFF9C4))
            .border(2.dp, Color(0xFFFBC02D), shape = RoundedCornerShape(10.dp))
            .padding(16.dp)
    ) {
        Text(
            text = "First Element",
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = modifier
                .background(color = Color(0xFFFBC02D), shape = RoundedCornerShape(8.dp))
                .padding(16.dp)
                .align(Alignment.TopStart),
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
        )
        Text(
            text = "Second Element",
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = modifier
                .background(color = Color(0xFFFBC02D), shape = RoundedCornerShape(8.dp))
                .padding(16.dp)
                .align(Alignment.Center),
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
        )
        Text(
            text = "Third Element",
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = modifier
                .background(color = Color(0xFFFBC02D), shape = RoundedCornerShape(8.dp))
                .padding(16.dp)
                .align(Alignment.BottomEnd),
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BoxAligneementPreview() {
    BoxAligneement()
}
