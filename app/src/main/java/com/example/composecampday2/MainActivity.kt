package com.example.composecampday2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composecampday2.ui.theme.ComposeCampDay2Theme
import com.example.composecampday2.ui.theme.colorGreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCampDay2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    Column(
        modifier = Modifier.fillMaxSize().padding(bottom = 20.dp, top = 150.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                modifier = Modifier.size(80.dp),
                painter = painterResource(id = R.drawable.compose),
                contentDescription = "Compose Image",
            )
            Text(text = "Full Name")
            Text(text = "Some simple title", color = colorGreen)
        }
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            OurSimpleRow(icon = Icons.Default.Call, text = "+2344343")
            Spacer(modifier = Modifier.height(10.dp))
            OurSimpleRow(icon = Icons.Default.Share, text = "@Android")
            Spacer(modifier = Modifier.height(10.dp))
            OurSimpleRow(icon = Icons.Default.Email, text = "email@em")
        }
    }
}

@Composable
fun OurSimpleRow(icon: ImageVector, text: String) {
    Row() {
        Icon(imageVector = icon, tint = colorGreen, contentDescription = "icon")
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = text)
    }
}

@Preview(showSystemUi = true)
@Composable
fun businessCardPrev() {
    ComposeCampDay2Theme {
        BusinessCardApp()
    }
}
