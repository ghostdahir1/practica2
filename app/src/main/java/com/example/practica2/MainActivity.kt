package com.example.practica2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun App() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.images),
                contentDescription = "Solair de astora",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
            )
            Text(
                text = "Solair de astora",
                fontSize = 24.sp,
                color = Color.White
            )
            Text(
                text = "AARON DAHIR LORENZANA HERNANDEZ",
                fontSize = 32.sp,
                color = Color.White,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(
                text = "HOLA MUNDOOOOOO",
                color = Color.White
            )
            Text(
                text = "PRACTICA 2",
                color = Color.White
            )
            Text(
                text = "Me gustan los pixel musho",
                color = Color.White
            )
            MyRowExample()
        }
    }
}

@Composable
fun MyRowExample() {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        item {
            Text(text = "Practica 3", color = Color.White)
        }
        item {
            Text(text = "Practica 3", color = Color.White)
        }
        item {
            Text(text = "HOLA", color = Color.White)
        }
        item {
            Text(text = "PROFE", color = Color.White)
        }
        item {
            Text(text = "COMO", color = Color.White)
        }
        item {
            Text(text = "ESTA", color = Color.White)
        }
        item {
            Text(text = "LE", color = Color.White)
        }
        item {
            Text(text = "MANDO", color = Color.White)
        }
        item {
            Text(text = "UN", color = Color.White)
        }
        item {
            Text(text = "SALUDO", color = Color.White)
        }
    }
}