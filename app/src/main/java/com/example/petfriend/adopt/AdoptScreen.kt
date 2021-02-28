package com.example.petfriend.adopt

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.petfriend.theme.PetFriendTheme

const val AdoptScreenRoute = "adopt"

@Composable
fun AdoptScreen(navController: NavController, adoptViewModel: AdoptViewModel) {
    AdoptContent(adoptViewModel.getPetsText())
}

@Composable
private fun AdoptContent(text: String) {
    Surface(color = MaterialTheme.colors.background) {
        Text(text)
    }
}

@Preview
@Composable
fun AdoptScreenPreview() {
    PetFriendTheme {
        AdoptContent(text = "Pets")
    }
}