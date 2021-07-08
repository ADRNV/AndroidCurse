package com.example.sampleapp.presentation.di

import com.example.sampleapp.presentation.data.AuthicationRepository
import com.example.sampleapp.presentation.data.IAuthicationRepository
import com.example.sampleapp.presentation.data.IAuthicationService
import com.example.sampleapp.presentation.data.StubAuthicationService
import com.example.sampleapp.presentation.domain.LoginModel
import com.example.sampleapp.presentation.presentation.login.LoginFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val loginModule = module {
    viewModel { LoginFragmentViewModel(get()) }
    single { LoginModel(get()) }
    single<IAuthicationRepository> { AuthicationRepository() }
    single<IAuthicationService> { StubAuthicationService() }
}