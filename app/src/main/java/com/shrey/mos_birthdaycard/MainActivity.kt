package com.example.birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shrey.mos_birthdaycard.R
import com.shrey.mos_birthdaycard.ui.theme.MOS_BirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MOS_BirthdayCardTheme{
                Surface(modifier = Modifier.fillMaxSize()) {
                    BirthdayCard()
                }
            }
        }
    }
}

@Composable
fun BirthdayCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFAF3DD))
            .clip(RoundedCornerShape(16.dp)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(R.drawable.cake_33), contentDescription = null,modifier = Modifier
            .size(120.dp)
            .padding(16.dp))

        Text(
            text = "Happy Birthday!",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF001F3F)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Happy birthday to you! Wishing you a day as special as you are",
            fontSize = 18.sp,
            color = Color(0xFF333333),
            textAlign = androidx.compose.ui.text.style.TextAlign.Center,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Cheers to another year!",
            fontSize = 18.sp,
            color = Color(0xFF333333),
            textAlign = androidx.compose.ui.text.style.TextAlign.Center,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBirthdayCard() {
   MOS_BirthdayCardTheme{
        BirthdayCard()
    }
}
