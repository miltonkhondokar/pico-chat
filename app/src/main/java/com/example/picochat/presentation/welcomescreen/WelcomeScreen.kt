package com.example.picochat.presentation.welcomescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.picochat.R

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // Illustration
        Image(
            painter = painterResource(id = R.drawable.whatsapp_sticker),
            contentDescription = null,
            modifier = Modifier.size(300.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Title
        Text(
            text = "Welcome to WhatsApp",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF075E54)
        )

        Spacer(modifier = Modifier.height(20.dp))

        // WhatsApp-style info text
        Row {
            Text(text = "Read our ", color = Color.Gray, fontSize = 14.sp)
            Text(
                text = "Privacy Policy",
                color = colorResource(id = R.color.light_green),
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
        }

        Row {
            Text(
                text = "Tap \"Agree and Continue\" to accept the ",
                color = Color.Gray,
                fontSize = 14.sp
            )
        }

        Row {
            Text(
                text = "Terms of Service",
                color = colorResource(id = R.color.light_green),
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        // ✔ WhatsApp style button
        Button(
            onClick = { /* TODO: Navigate */ },
            modifier = Modifier
                .width(280.dp)
                .height(48.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.dark_green)
            )
        ) {
            Text(
                text = "AGREE AND CONTINUE",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen()
}
