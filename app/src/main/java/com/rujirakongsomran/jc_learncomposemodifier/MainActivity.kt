package com.rujirakongsomran.jc_learncomposemodifier

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rujirakongsomran.jc_learncomposemodifier.ui.theme.JC_LearnComposeModifierTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_LearnComposeModifierTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun TaroImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.taro),
        contentDescription = "TaroImage",
        contentScale = ContentScale.FillWidth,
        modifier = modifier
    )
}



@Composable
fun TaroImageSizePreview() {
    JC_LearnComposeModifierTheme {
        TaroImage(
            modifier = Modifier
                .size(100.dp, 50.dp)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun TaroImageSize2Preview() {
    JC_LearnComposeModifierTheme {
        TaroImage(
            modifier = Modifier
                .width(100.dp)
                .height(50.dp)
        )
    }
}