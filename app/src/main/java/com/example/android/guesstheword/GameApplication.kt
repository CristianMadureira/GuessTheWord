package com.example.android.guesstheword

import android.app.Application
import com.example.android.guesstheword.di.gameModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class GameApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@GameApplication)

            modules(gameModule)
        }
    }
}