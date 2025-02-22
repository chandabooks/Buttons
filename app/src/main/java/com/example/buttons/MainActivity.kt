package com.example.buttons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.buttons.ui.theme.ButtonsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val demoType = 9
        setContent {
            ButtonsTheme {
                Surface(modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.Center)) {
                    TopUIElement(modifier = Modifier.fillMaxSize(), type = demoType)
                }

            }
        }
    }
}

@Composable
fun TopUIElement(modifier: Modifier = Modifier, type: Int = 0) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        when (type) {
            0 -> FilledButtonDemo()
            1 -> TonalButtonDemo()
            2 -> ElevatedButtonDemo()
            3 -> OutlinedButtonDemo()
            4 -> TextButtonDemo()
            5 -> FloatingActionButtonDemo()
            6 -> SmallFloatingActionButtonDemo()
            7 -> LargeFloatingActionButtonDemo()
            8 -> ExtendedFloatingActionButtonDemo()
            9 -> ShowAllButton()

        }
    }
}

@Composable
fun FilledButtonDemo(modifier: Modifier = Modifier) {

    var clickCount by remember { mutableIntStateOf(0) }
    val spaceSize = integerResource(R.integer.smallSpace)
    val clickLabel = stringResource(R.string.clickLabel)

    Column(modifier = modifier) {
        Button(
            onClick = { clickCount++ },
            // colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
        ) {
            Text("Filled Button")
        }
        Spacer(modifier = Modifier.size(spaceSize.dp))
        Text(text = "$clickLabel $clickCount")

    }
}

@Composable
fun ElevatedButtonDemo(modifier: Modifier = Modifier) {
    var clickCount by remember { mutableIntStateOf(0) }
    val spaceSize = integerResource(R.integer.smallSpace)
    val clickLabel = stringResource(R.string.clickLabel)

    Column(modifier = modifier) {
        ElevatedButton(onClick = { clickCount++ }) {
            Text("Elevated Button")
        }
        Spacer(modifier = Modifier.size(spaceSize.dp))
        Text(text = "$clickLabel $clickCount")

    }
}

@Composable
fun TonalButtonDemo(modifier: Modifier = Modifier) {
    var clickCount by remember { mutableIntStateOf(0) }
    val spaceSize = integerResource(R.integer.smallSpace)
    val clickLabel = stringResource(R.string.clickLabel)

    Column(modifier = modifier) {
        FilledTonalButton(onClick = { clickCount++ }) {
            Text("Tonal Button")
        }
        Spacer(modifier = Modifier.size(spaceSize.dp))
        Text(text = "$clickLabel $clickCount")

    }
}

@Composable
fun OutlinedButtonDemo(modifier: Modifier = Modifier) {
    var clickCount by remember { mutableIntStateOf(0) }
    val spaceSize = integerResource(R.integer.smallSpace)
    val clickLabel = stringResource(R.string.clickLabel)

    Column(modifier = modifier) {
        OutlinedButton(onClick = { clickCount++ }) {
            Text("Outlined Button")
        }
        Spacer(modifier = Modifier.size(spaceSize.dp))
        Text(text = "$clickLabel $clickCount")

    }
}

@Composable
fun TextButtonDemo(modifier: Modifier = Modifier) {
    var clickCount by remember { mutableIntStateOf(0) }
    val spaceSize = integerResource(R.integer.smallSpace)
    val clickLabel = stringResource(R.string.clickLabel)

    Column(modifier = modifier) {
        TextButton(onClick = { clickCount++ }) {
            Text("Text Button")
        }
        Spacer(modifier = Modifier.size(spaceSize.dp))
        Text(text = "$clickLabel $clickCount")

    }
}

@Composable
fun FloatingActionButtonDemo(modifier: Modifier = Modifier) {
    var clickCount by remember { mutableIntStateOf(0) }
    val spaceSize = integerResource(R.integer.smallSpace)
    val clickLabel = stringResource(R.string.clickLabel)

    Column(modifier = modifier) {
        FloatingActionButton(
            onClick = { clickCount++ },
        ) {
            Icon(Icons.Filled.Add, "Floating action button.")
        }
        Spacer(modifier = Modifier.size(spaceSize.dp))
        Text(text = "$clickLabel $clickCount")
    }
}

@Composable
fun SmallFloatingActionButtonDemo(modifier: Modifier = Modifier) {
    var clickCount by remember { mutableIntStateOf(0) }
    val spaceSize = integerResource(R.integer.smallSpace)
    val clickLabel = stringResource(R.string.clickLabel)

    Column(modifier = modifier) {
        SmallFloatingActionButton(
            onClick = { clickCount++ },
            containerColor = MaterialTheme.colorScheme.secondaryContainer,
            contentColor = MaterialTheme.colorScheme.secondary
        ) {
            Icon(Icons.Filled.Add, "Floating action button.")
        }
        Spacer(modifier = Modifier.size(spaceSize.dp))
        Text(text = "$clickLabel $clickCount")
    }
}

@Composable
fun LargeFloatingActionButtonDemo(modifier: Modifier = Modifier) {
    var clickCount by remember { mutableIntStateOf(0) }
    val spaceSize = integerResource(R.integer.smallSpace)
    val clickLabel = stringResource(R.string.clickLabel)

    Column(modifier = modifier) {
        LargeFloatingActionButton(
            onClick = { clickCount++ }, shape = CircleShape
        ) {
            Icon(Icons.Filled.Add, "Floating action button.")
        }
        Spacer(modifier = Modifier.size(spaceSize.dp))
        Text(text = "$clickLabel $clickCount")
    }
}

@Composable
fun ExtendedFloatingActionButtonDemo(modifier: Modifier = Modifier) {
    var clickCount by remember { mutableIntStateOf(0) }
    val spaceSize = integerResource(R.integer.smallSpace)
    val clickLabel = stringResource(R.string.clickLabel)

    Column(modifier = modifier) {
        ExtendedFloatingActionButton(onClick = { clickCount++ }) {
            Icon(Icons.Filled.Add, "Floating action button.")
            Text(text = "Extended Button")
        }
        Spacer(modifier = Modifier.size(spaceSize.dp))
        Text(text = "$clickLabel $clickCount")
    }
}

@Preview
@Composable
fun ShowAllButton(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        FilledButtonDemo()
        TonalButtonDemo()
        ElevatedButtonDemo()
        OutlinedButtonDemo()
        TextButtonDemo()
        FloatingActionButtonDemo()
        SmallFloatingActionButtonDemo()
        LargeFloatingActionButtonDemo()
        ExtendedFloatingActionButtonDemo()
    }

}
