package com.example.petfriend.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.petfriend.theme.PetFriendTheme
import com.example.petfriend.ui.adopt.AdoptScreenRoute
import com.example.petfriend.viewmodel.HomeViewModel

const val HomeScreenRoute = "home"

@Composable
fun HomeScreen(navController: NavController, viewModel: HomeViewModel) {
    Surface(color = MaterialTheme.colors.background) {
        Greeting(viewModel.getString()) {
            navController.navigate(AdoptScreenRoute)
        }
    }
}

@Composable
fun Greeting(name: String, onNavigateEvent: () -> Unit) {
    Column {
        Text(text = "Hello $name!")
        Button(onClick = onNavigateEvent) {
            BasicText(text = "Click to see pets!")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PetFriendTheme {
        Greeting("Sample text") {}
    }
}
