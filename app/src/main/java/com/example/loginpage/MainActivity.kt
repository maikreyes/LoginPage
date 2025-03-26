package com.example.loginpage

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginpage.ui.theme.LoginPageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginPageTheme {

            }
        }
    }
}

@Preview(name = "Light Mode", showBackground = true)
@Preview(name = "Dark mode", uiMode = Configuration.UI_MODE_NIGHT_YES )
@Composable
fun LoginPreview() {
    LoginPageTheme {
        Surface (
            modifier = Modifier
                .fillMaxSize()) {
            LoginPage(
                modifier = Modifier
                    .wrapContentSize(Alignment.Center)
            )
        }
    }
}

@Composable
fun LoginPage(modifier: Modifier = Modifier) {

    var Username by remember { mutableStateOf("") }
    var Password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface),
        contentAlignment = Alignment.Center
    ){
        Column (
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LoginImage(
                modifier = modifier
            )
            InputsFields(
                username = Username,
                password = Password,
                onUsernameChange = {
                    Username = it
                },
                onPasswordChange = {
                    Password = it
                },
                modifier = modifier
            )
            Spacer(
                modifier = modifier
                    .padding(128.dp)
            )
            LoginButtons(
                modifier = modifier
            )
        }
    }


}

@Composable
fun InputsFields (
    username : String,
    password : String,
    onPasswordChange : (String) -> Unit,
    onUsernameChange : (String) -> Unit,
    modifier: Modifier = Modifier
){
    OutlinedTextField(
        value = username,
        onValueChange = onUsernameChange,
        label = {
            Text(
                "Username"
            )
        },
        shape = RoundedCornerShape(30.dp),
        modifier = modifier
            .padding(horizontal = 16.dp, vertical = 4.dp)
            .fillMaxWidth()
    )
    OutlinedTextField(
        value = password,
        onValueChange = onPasswordChange,
        label = {
            Text(
                "Password"
            )
        },
        shape = RoundedCornerShape(30.dp),
        visualTransformation = PasswordVisualTransformation(),
        modifier = modifier
            .padding(horizontal = 16.dp, vertical = 4.dp)
            .fillMaxWidth()
    )
}

@Composable
fun LoginImage (modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = "1",
        modifier = modifier
            .padding(64.dp)
    )
}

@Composable
fun LoginButtons(modifier: Modifier = Modifier) {
    FilledTonalButton(
        modifier = modifier
            .padding(8.dp)
            .fillMaxWidth(),
        onClick = {}
    ) {
        Text(
            text = "Login"
        )
    }
    OutlinedButton(
        modifier = modifier
            .padding(horizontal = 8.dp)
            .fillMaxWidth(),
        onClick = {}
    ) {
        Text(
            text = "Register"
        )
    }
}