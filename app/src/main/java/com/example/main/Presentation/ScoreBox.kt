package com.example.main.Presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.main.ui.theme.Belw
import com.example.main.ui.theme.bele

@Composable
fun BottomBox() {
    Box(modifier = Modifier
        .height(200.dp)
        .width(400.dp)
        .clip(RoundedCornerShape(10.dp))
        .background(Belw)) {
        Column(modifier = Modifier.fillMaxSize()) {


        }

    }

}

@Composable
@Preview
fun BottomBoxPreview() {
    BottomBox()
}