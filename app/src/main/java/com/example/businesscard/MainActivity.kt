package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Bottom
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Arrangement.End
import androidx.compose.foundation.layout.Arrangement.SpaceAround
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ){
                    PersonalCard()
                    SocialCard()
                }
            }
        }
    }
}

@Composable
fun PersonalCard(modifier: Modifier = Modifier){
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = CenterHorizontally,
        verticalArrangement = Center
    ){
        Image(
            painter = painterResource(R.drawable.p_image),
            contentDescription = null,

            Modifier
                .size(250.dp)
                .padding(16.dp),
        )
        Text(
            text = "Jeffrey van Tillo",
            fontSize = 29.sp
        )
        Text(
            text = "Junior App/Web Developer",
        )
    }
}

@Composable
fun SocialCard(modifier: Modifier = Modifier){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 24.dp, start = 50.dp),
        verticalArrangement = Arrangement.Bottom
    ){
        Row(){
            Icon(
                painter = painterResource(R.drawable.call),
                contentDescription = null,
                Modifier.padding(3.dp),
            )
            Text(
                text = stringResource(R.string.phonenumber)
            )
        }
        Row() {
            Icon(
                painter = painterResource(R.drawable.mail),
                contentDescription = null,
                Modifier.padding(3.dp)
            )
            Text(
                text = stringResource(R.string.mail)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        PersonalCard()
        SocialCard()
    }
}