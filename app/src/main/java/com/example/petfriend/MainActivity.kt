package com.example.petfriend

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.petfriend.adopt.AdoptScreen
import com.example.petfriend.adopt.AdoptScreenRoute
import com.example.petfriend.adopt.AdoptViewModel
import com.example.petfriend.home.HomeScreen
import com.example.petfriend.home.HomeScreenRoute
import com.example.petfriend.home.HomeViewModel
import com.example.petfriend.theme.PetFriendTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val homeViewModel: HomeViewModel by viewModels()
    private val adoptViewModel: AdoptViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PetFriendTheme {
                val navController = rememberNavController()
                NavHost(navController, startDestination = HomeScreenRoute) {
                    composable(HomeScreenRoute) {
                        HomeScreen(
                            navController = navController,
                            homeViewModel
                        )
                    }
                    composable(AdoptScreenRoute) {
                        AdoptScreen(
                            navController = navController,
                            adoptViewModel
                        )
                    }
                }
            }
        }
    }
}
