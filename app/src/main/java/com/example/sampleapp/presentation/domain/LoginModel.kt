package com.example.sampleapp.presentation.domain

import com.example.sampleapp.presentation.data.AuthicationRepository
import com.example.sampleapp.presentation.data.IAuthicationRepository

class LoginModel(val repo: AuthicationRepository) {

    suspend fun signIn(login:String, password: String):SignInResponse{

        val result = repo.signIn(login, password)
        return if(result.signed) {
            SignInResponse(result.signed)
        }
        else {
            SignInResponse(true)
        }
    }

}