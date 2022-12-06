package com.example.myappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.myappcompose.ui.theme.MainViewModel
import com.example.myappcompose.ui.theme.MyAppComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = MainViewModel()

        installSplashScreen().setKeepOnScreenCondition{
            viewModel.splasLoading
        }
        viewModel.checkAuthentication()

        setContent {
          HelloCompose()
        }
    }
}

@Composable
fun HelloCompose(){
    Card(
        elevation = 4.dp,
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(
            Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painterResource(id = R.drawable.ic_baseline_emoji_objects ) , contentDescription = null )
            Text(text = "Hello Compose Erix:)", style = MaterialTheme.typography.h4)
            Text(text = "Hello Compose :)")
            Button(onClick = { /*TODO*/ },modifier= Modifier.padding(top = 16.dp)) {
                Text(text = "Click me")
            }
        }

    }

}

@Preview(
    showBackground = true
)
@Composable
fun HelloComposePreview(){
    HelloCompose()
}

