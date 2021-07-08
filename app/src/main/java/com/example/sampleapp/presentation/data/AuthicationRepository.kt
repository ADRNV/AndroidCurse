package com.example.sampleapp.presentation.data

import com.example.sampleapp.presentation.domain.SignInResponse

class AuthicationRepository : IAuthicationRepository {

    override suspend fun signIn(login:String, password:String):SignInResponse
    {
        return if(login.length > 8 && password.length > 8){SignInResponse(true)}
        else SignInResponse(false)


    }
}