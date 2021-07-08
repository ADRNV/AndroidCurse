package com.example.sampleapp.presentation.data

import com.example.sampleapp.presentation.domain.SignInResponse

interface IAuthicationService {
    suspend fun signIn(login:String, password: String): SignInResponse
}