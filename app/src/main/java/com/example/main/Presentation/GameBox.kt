package com.example.main.Presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.main.ui.theme.bele
import com.example.main.ui.theme.yellow

@Composable
fun GameBox(modifier: Modifier) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { /*TODO*/ }, modifier = Modifier
                .size(140.dp),
            colors = ButtonDefaults.buttonColors(containerColor = yellow, contentColor = bele)
        ) {
            Text(text = "North", fontSize = 26.sp)

        }
        Row() {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(140.dp),
                colors = ButtonDefaults.buttonColors(containerColor = yellow, contentColor = bele)
            ) {
                Text(text = "East", fontSize = 26.sp)
            }

            Box(modifier = Modifier.size(120.dp))

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(140.dp),
                colors = ButtonDefaults.buttonColors(containerColor = yellow, contentColor = bele)
            ) {
                Text(text = "West", fontSize = 26.sp)
            }
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.size(140.dp),
            colors = ButtonDefaults.buttonColors(containerColor = yellow, contentColor = bele)
        ) {
            Text(text = "South", fontSize = 26.sp)

        }

    }


}


@Composable
@Preview
fun GameBoxPreview() {
    GameBox(modifier = Modifier)
}