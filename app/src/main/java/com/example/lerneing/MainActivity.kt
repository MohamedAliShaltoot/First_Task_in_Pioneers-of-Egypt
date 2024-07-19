package com.example.lerneing

import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.magnifier
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lerneing.ui.theme.LerneingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SignUpComponent()
           // LoginComponent()


        }
    }
}
@Composable

fun SignUpComponent() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(start = 10.dp, end = 0.2.dp)
    ) {

        Image(painter = painterResource(id = R.drawable.p2), contentDescription = null)
        Spacer(modifier = Modifier.height(10.dp))
        Box(){
            Icon(Icons.Filled.AccountCircle, contentDescription = null)
            TextField(
                value = "Email",
                onValueChange = {},

                )
        }
        // TextField(value = " Username", onValueChange = {})
        Spacer(modifier = Modifier.height(9.dp))
        
        
        TextField(value = " Password", onValueChange = {})

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { }) {
            Text(text = " Sign Up", fontSize = 10.sp)
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row {
            Text(text = "Already have an account? ")
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = " Login ",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue,
                modifier = Modifier.clickable { })

        }


        Spacer(modifier = Modifier.height(23.dp))

        Box(modifier = Modifier.clickable { }) {
           Column {
                Row {
                    //TextField(value = "", onValueChange ={} )

                    Image(
                        painter = painterResource(id = R.drawable.facebook),
                        contentDescription = null,
                        Modifier.width(20.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(text = "Signup with Facebook ", color = Color.Blue, fontWeight = FontWeight.Bold)
                }
                Spacer(modifier = Modifier.height(20.dp))
            }
        }
        Box(modifier = Modifier.clickable { }) {
            Column {

                Row {
                    Image(
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = null,
                        Modifier.width(50.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(text = "Signup with Google ", color = Color.Blue, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

// distane between login and SIgnUp

    @Composable

    fun LoginComponent() {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(start = 10.dp, end = 0.2.dp)
        ) {

            Image(painter = painterResource(id = R.drawable.p1), contentDescription = null)
            Spacer(modifier = Modifier.height(15.dp))
            Box {
                Icon(Icons.Filled.AccountCircle, contentDescription = null)
                TextField(
                    value = "Username",
                    onValueChange = {},

                    )
            }

            Spacer(modifier = Modifier.height(10.dp))
            TextField(value = " Password", onValueChange = {})

            Spacer(modifier = Modifier.height(25.dp))

            Button(onClick = { }) {
                Text(text = "     Login     ")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                Text(text = "Don't have an account? ")
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = " Sign up ",
                    fontSize = 15.sp,
                    color = Color.Blue,
                    modifier = Modifier.clickable { })

            }
            Spacer(modifier = Modifier.height(30.dp))





            Box(modifier = Modifier.clickable { }) {
                Column {
                    Row {


                        Image(
                            painter = painterResource(id = R.drawable.facebook),
                            contentDescription = null,
                            Modifier.width(20.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(text = "Login with Facebook ", color = Color.Blue, fontWeight = FontWeight.Bold)
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                }
            }
            Box(modifier = Modifier.clickable { }) {
                Column {

                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.google),
                            contentDescription = null,
                            Modifier.width(50.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(text = "Login with Google ", color = Color.Blue, fontWeight = FontWeight.Bold)
                    }
                }
            }


            }


        }











