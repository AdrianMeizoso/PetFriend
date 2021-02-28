package com.example.petfriend.adopt

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AdoptViewModel @Inject constructor(private val petsRepository: PetsRepository) : ViewModel() {

    fun getPetsText() = petsRepository.getPetsText()

}