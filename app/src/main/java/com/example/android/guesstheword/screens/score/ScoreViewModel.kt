package com.example.android.guesstheword.screens.score

import androidx.lifecycle.ViewModel
import android.util.Log
import androidx.lifecycle.ViewModelProvider

class ScoreViewModel(finalScore: Int): ViewModel() {

    var score = finalScore

    init{
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }
}
