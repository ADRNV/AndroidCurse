package com.example.sampleapp.presentation.data

import com.example.sampleapp.presentation.domain.SignInResponse

interface IAuthicationRepository {
    suspend fun signIn(login:String,passwor:String):SignInResponse
}