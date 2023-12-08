package com.rujirakongsomran.jc_learncomposemodifier

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
        contentScale = ContentScale.Crop,
        modifier = modifier
    )
}

@Composable
fun CreateBackground() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .border(4.dp, Color.Red)
            .background(Color.Blue)
    )
}

fun Modifier.colorfulBorder() =
    background(Color.Red)
        .padding(16.dp)
        .background(Color.Yellow)
        .padding(16.dp)
        .background(Color.Green)
        .padding(16.dp)
        .background(Color.Blue)
        .padding(16.dp)
        .background(Color.Cyan)
        .padding(16.dp)

@Composable
fun TaroImageVerticalScroll() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(
                rememberScrollState()
            )
    ) {
        TaroImage(
            modifier = Modifier
                .padding(32.dp)
                .fillMaxWidth()
        )
        TaroImage(
            modifier = Modifier
                .padding(32.dp)
                .fillMaxWidth()
        )

        TaroImage(
            modifier = Modifier
                .padding(32.dp)
                .fillMaxWidth()
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun TaroImageVerticalScrollPreview() {
    JC_LearnComposeModifierTheme {
        TaroImageVerticalScroll()
    }
}

@Composable
fun ReuseCustomModifierPreview() {
    JC_LearnComposeModifierTheme {
        TaroImage(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .colorfulBorder()
        )
    }
}

@Composable
fun ReuseCustomModifier2Preview() {
    JC_LearnComposeModifierTheme {
        val catImageModifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .colorfulBorder()
        TaroImage(
            modifier = catImageModifier
        )
    }
}

@Composable
fun CreateBackgroundPreview() {
    JC_LearnComposeModifierTheme {
        CreateBackground()
    }
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

@Composable
fun TaroImageFillMaxWidthPreview() {
    JC_LearnComposeModifierTheme {
        TaroImage(
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}

@Composable
fun TaroImageFillMaxWidth2Preview() {
    JC_LearnComposeModifierTheme {
        TaroImage(
            modifier = Modifier
                .fillMaxWidth(0.5f)
        )
    }
}

@Composable
fun TaroImagePadding1Preview() {
    JC_LearnComposeModifierTheme {
        TaroImage(
            modifier = Modifier
                .padding(
                    top = 32.dp,
                    bottom = 64.dp,
                    start = 24.dp,
                    end = 16.dp
                )
        )
    }
}

@Composable
fun TaroImagePadding2Preview() {
    JC_LearnComposeModifierTheme {
        TaroImage(
            modifier = Modifier
                .padding(
                    horizontal = 16.dp,
                    vertical = 64.dp
                )
        )
    }
}

@Composable
fun TaroImagePadding3Preview() {
    JC_LearnComposeModifierTheme {
        TaroImage(
            modifier = Modifier
                .padding(16.dp)
        )
    }
}

@Composable
fun TaroImageOrderModifierPreview() {
    JC_LearnComposeModifierTheme {
        TaroImage(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green)
                .padding(32.dp)
        )
    }
}

@Composable
fun TaroImageOrderModifier2Preview() {
    JC_LearnComposeModifierTheme {
        TaroImage(
            modifier = Modifier
                .padding(32.dp)
                .fillMaxWidth()
                .background(Color.Green)
                .padding(32.dp)
        )
    }
}


@Composable
fun TaroImageColorfulBorderPreview() {
    JC_LearnComposeModifierTheme {
        TaroImage(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .background(Color.Red)
                .padding(16.dp)
                .background(Color.Yellow)
                .padding(16.dp)
                .background(Color.Green)
                .padding(16.dp)
                .background(Color.Blue)
                .padding(16.dp)
                .background(Color.Cyan)
                .padding(16.dp)
        )
    }
}

@Composable
fun TaroImageBlurPreview() {
    JC_LearnComposeModifierTheme {
        TaroImage(
            modifier = Modifier
                .fillMaxWidth()
                .blur(16.dp)
        )
    }
}

@Composable
fun TaroImageClipPreview() {
    JC_LearnComposeModifierTheme {
        TaroImage(
            modifier = Modifier
                .padding(32.dp)
                .size(300.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 64.dp,
                        bottomEnd = 64.dp
                    )
                )
        )
    }
}

@Composable
fun TaroImageClickablePreview() {
    JC_LearnComposeModifierTheme {
        TaroImage(
            modifier = Modifier
                .padding(32.dp)
                .clip(CircleShape)
                .clickable { }

        )
    }
}



