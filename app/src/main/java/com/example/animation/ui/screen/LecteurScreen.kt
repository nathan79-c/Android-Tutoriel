package com.example.animation.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.SkipNext
import androidx.compose.material.icons.filled.SkipPrevious
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.animation.R

@Composable
fun MusicPlayerScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(colors = listOf(Color(0xFF502680), Color(0xFF322354))))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp)
        ) {
            // Top Image Section with circular progress
            ImageHolder()

            Spacer(modifier = Modifier.height(32.dp))

            // Song Title & Artist Info
            SongInfo()

            Spacer(modifier = Modifier.height(32.dp))

            // Playback Controls
            PlaybackControls()

            Spacer(modifier = Modifier.height(16.dp))

            // Song Progress Bar & Time
            SongProgress()

            Spacer(modifier = Modifier.height(16.dp))

            // Song List Section
            SongList()
        }
    }
}

@Composable
fun ImageHolder() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(200.dp)
            .clip(RoundedCornerShape(50))
            .background(Color.White)
    ) {
        Image(
            painter = painterResource(R.drawable.imagecover), // Replace with your image resource
            contentDescription = "Album Cover",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(180.dp)
        )
        CircularProgressIndicator(
            progress = {
                // Calculate your progress value here
                0.6f
            },
            modifier = Modifier.size(220.dp),
            color = Color(0xFF7D4CC2),
            strokeWidth = 16.dp
        )
    }
}


@Composable
fun SongInfo() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Akuma",
            color = Color.White,
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
        )
        Text(
            text = "Danzei Morgan",
            color = Color(0xFFAAAAAA),
            style = TextStyle(fontSize = 14.sp)
        )
    }
}

@Composable
fun PlaybackControls() {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxWidth()
    ) {
        IconButton(onClick = { /* Handle previous */ }) {
            Icon(Icons.Default.SkipPrevious, contentDescription = "Previous", tint = Color.White)
        }
        IconButton(onClick = { /* Handle play/pause */ }) {
            Icon(Icons.Default.PlayArrow, contentDescription = "Play", tint = Color.White)
        }
        IconButton(onClick = { /* Handle next */ }) {
            Icon(Icons.Default.SkipNext, contentDescription = "Next", tint = Color.White)
        }
    }
}

@Composable
fun SongProgress() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "01:15", color = Color.White, style = TextStyle(fontSize = 12.sp))
        Slider(
            value = 0.5f, // Change based on actual progress
            onValueChange = { /* Handle slider */ },
            colors = SliderDefaults.colors(
                thumbColor = Color.White,
                activeTrackColor = Color(0xFF7D4CC2)
            ),
            modifier = Modifier.fillMaxWidth()
        )
        Text(text = "03:15", color = Color.White, style = TextStyle(fontSize = 12.sp))
    }
}

@Composable
fun SongList() {
    LazyColumn(
        modifier = Modifier.fillMaxWidth()
    ) {
        items(listOf("Akuma", "Empire", "Cyber")) { song ->
            SongListItem(song)
        }
    }
}

@Composable
fun SongListItem(song: String) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color(0xFF322354), shape = RoundedCornerShape(10.dp))
            .padding(16.dp)
    ) {
        Text(text = song, color = Color.White)
        Text(text = "03:15", color = Color(0xFFAAAAAA))
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMusicPlayerScreen() {
    MusicPlayerScreen()
}

