package com.example.petfriend.adopt

import javax.inject.Inject

class PetsRepository @Inject constructor() {

    fun getPetsText() = "We like Dogs!"
}