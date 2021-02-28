package com.example.petfriend.viewmodel

import androidx.lifecycle.ViewModel
import com.example.petfriend.data.PetsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AdoptViewModel @Inject constructor(private val petsRepository: PetsRepository) : ViewModel() {

    fun getPetsText() = petsRepository.getPetsText()

}