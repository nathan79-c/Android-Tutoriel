package com.example.animation.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProductListWithColumn() {
    Column {
        for (i in 1..100) {
            ProductItem("Produit $i", "Description du produit $i")
        }
    }
}

@Composable
fun ProductItem(name: String, description: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color.LightGray, RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        Text(text = name, style =MaterialTheme.typography.titleMedium)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = description)
    }
}

@Composable
fun ProductListWithLazyColumn() {
    LazyColumn {
        items(100) { index ->
            ProductItem("Produit $index", "Description du produit $index")
        }
    }
}
@Composable
fun ProductListWithLazyRow() {
    LazyRow {
        items(100) { index ->
            ProductItem("Produit $index", "Description du produit $index")
        }
    }
}
@Composable
fun ProductListWithLazyGrid() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2), // Two columns
        content = {
            items(100) { index ->
                ProductItem("Product $index", "Description of product $index")
            }
        }
    )
}


@Preview (showBackground = true)
@Composable
fun ProductListWithColumnPreview() {
    ProductListWithColumn()
}

@Preview(showBackground = true)
@Composable
fun ProductListWithLazyColumnPreview() {
    ProductListWithLazyColumn()
}
@Preview(showBackground = true)
@Composable
fun ProductListWithLazyRowPreview() {
    ProductListWithLazyRow()
}
@Preview(showBackground = true)
@Composable
fun ProductListWithLazyGridPreview() {
    ProductListWithLazyGrid()
}
