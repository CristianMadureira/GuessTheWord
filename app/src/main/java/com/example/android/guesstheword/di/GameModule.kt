package com.example.android.guesstheword.di

import com.example.android.guesstheword.screens.game.GameViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val gameModule = module {
    viewModel {
        GameViewModel()
    }
}