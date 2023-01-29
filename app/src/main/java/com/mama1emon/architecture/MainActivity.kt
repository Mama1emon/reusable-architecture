package com.mama1emon.architecture

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mama1emon.architecture.ui.theme.CleanArchitectureActivityTheme
import com.mama1emon.feature.card.api.CardEntry
import com.mama1emon.feature.profile.api.ProfileEntry
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var cardEntry: CardEntry

    @Inject
    lateinit var profileEntry: ProfileEntry

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanArchitectureActivityTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController, startDestination = "greeting"
                ) {
                    composable(route = "greeting") {
                        Column(modifier = Modifier.fillMaxSize()) {
                            Greeting("Andrew!")
                            Button(modifier = Modifier.fillMaxWidth(),
                                onClick = { navController.navigate("card") }) {
                                Text(text = "Go to Card")
                            }
                            Button(modifier = Modifier.fillMaxWidth(),
                                onClick = { navController.navigate("profile") }) {
                                Text(text = "Go to Profile")
                            }
                        }
                    }
                    with(cardEntry) {
                        getComposable()
                    }
                    with(profileEntry) {
                        getComposable()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CleanArchitectureActivityTheme {
        Greeting("Android")
    }
}