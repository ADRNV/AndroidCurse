package com.example.sampleapp.presentation

import android.app.Application
import com.example.sampleapp.presentation.di.loginModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@App)
            modules(loginModule)
        }
    }
}