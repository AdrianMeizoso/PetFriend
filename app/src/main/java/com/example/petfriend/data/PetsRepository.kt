package com.example.petfriend.data

import javax.inject.Inject

class PetsRepository @Inject constructor() {

    fun getPetsText() = "We like Dogs!"
}