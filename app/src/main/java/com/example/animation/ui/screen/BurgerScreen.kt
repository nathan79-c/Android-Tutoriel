package com.example.animation.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.animation.R


@Composable
fun BurgerScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), // Reduced padding
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly // Ensures components are close
    ) {
        // Top Bar with Icons
        TopBarIcon(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp) // Reduced vertical padding
        )

        // Header with title and description
        TextHeader(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp) // Reduced vertical padding
        )

        // Circular Image of the burger with favorite icon
        CenterCircularImage(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp) // Reduced vertical padding
        )

        // Size options (S, M, L) and buy button
        TailleArticle(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp) // Reduced vertical padding
        )
    }
}

@Composable
fun TopBarIcon(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Filled.ArrowBackIosNew,
            contentDescription = null,
            tint = Color.Black // Arrow icon in black
        )
        Icon(
            imageVector = Icons.Filled.MoreVert,
            contentDescription = null,
            tint = Color.Black // More icon in black
        )
    }
}

@Composable
fun TextHeader(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Beef Burger",
            style = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.Bold, // Bold and large size
                color = Color.Black // Black color for bold header
            )
        )
        Text(
            text = "Description for Food here, this is the random detail...",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun CenterCircularImage(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        // Circular Image with border
        Box(
            modifier = Modifier
                .size(250.dp)
                .clip(CircleShape)
                .border(20.dp, Color(0xFFFFA726).copy(alpha = 0.7f), CircleShape), // Orange border with slight opacity
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.burgers), // Replace with your image resource
                contentDescription = "burger beef",
                modifier = Modifier
                    .size(200.dp) // Ensure image fits within the circle
                    .clip(CircleShape),
                contentScale = ContentScale.Crop // Ensure the image covers the whole circle
            )
        }

        // Favorite Icon placed on the outer edge
        Icon(
            imageVector = Icons.Filled.FavoriteBorder,
            contentDescription = null,
            tint = Color.Red,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .background(Color.White, shape = CircleShape)
                .padding(8.dp)
        )
    }
}

@Composable
fun TailleArticle(modifier: Modifier = Modifier) {
    var selectedSize by remember { mutableStateOf("M") }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // Size options S, M, L
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            listOf("S", "M", "L").forEach { size ->
                Button(
                    onClick = { selectedSize = size },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (selectedSize == size) Color(0xFFFFA726).copy(alpha = 0.7f) else Color.White,
                        contentColor = if (selectedSize == size) Color.White else Color.Black
                    ),
                    border = BorderStroke(1.dp, Color(0xFFFFA726).copy(alpha = 0.7f))
                ) {
                    Text(text = size)
                }
            }
        }

        // Price section
        Text(
            text = "Price: 12.99 $",
            style = MaterialTheme.typography.bodyLarge,
            color = Color(0xFFFFA726), // Orange color for price
            modifier = Modifier.padding(top = 4.dp) // Reduced padding
        )

        // Buy Now button
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFFA726).copy(alpha = 0.7f) // Slightly opaque orange background
            ),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Buy Now")
        }
    }
}



@Preview(showBackground = true)
@Composable
fun BurgerScreenPreview() {
    BurgerScreen()
}
