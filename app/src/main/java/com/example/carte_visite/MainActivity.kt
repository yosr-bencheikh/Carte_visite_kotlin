package com.example.carte_visite
import androidx.compose.ui.graphics.vector.ImageVector

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import com.example.carte_visite.ui.theme.Carte_visiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Carte_visiteTheme {

                Screen()
            }
        }
    }
}

@Composable
fun Screen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFB7F7DB)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(150.dp)
                    .padding(bottom = 16.dp),
                contentScale = ContentScale.Crop
            )

            Text(
                text = "Yosr Ben Cheikh Brahim",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = Color.Black // Couleur noire pour le nom
            )

            Text(
                text = "Développeur web et mobile",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(vertical = 8.dp),
                color = Color(0xFF3DDC84)
            )

            Spacer(modifier = Modifier.height(70.dp))


            ContactInfoRow(Icons.Default.Phone, "+216 12 345 678")
            ContactInfoRow(Icons.Default.Share, "@AndroidDev")
            ContactInfoRow(Icons.Default.Email, "yosrbencheikh28@gmail.com")
        }
    }
}

@Composable
fun ContactInfoRow(icon: ImageVector, info: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 4.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF3DDC84),
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = info,
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center,
            color = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Carte_visiteTheme {
        Screen()
    }
}
