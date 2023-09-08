package com.example.devops_eduhub


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.devops_eduhub.ui.theme.Devops_eduhubTheme
import androidx.compose.foundation.layout.Column

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Yuvraj", "Hey everyone I am Yuvraj Chhetri"))

            }
        }
    }

@Composable
fun MessageCard(msg: Message){
    Column {
        Text(text = msg.author)
        Text(text = msg.name)
    }
}

data class Message(val author: String, val name: String)

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(
        msg = Message("Yuvraj", "Hey, take a look at Jetpack Compose, it's great!")
    )
}
