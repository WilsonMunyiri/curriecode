package com.example.kojpy

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val score = intent.getIntExtra("SCORE", 0)
        val totalQuestions = intent.getIntExtra("TOTAL_QUESTIONS", 0)

        val resultLayout = findViewById<LinearLayout>(R.id.resultLayout)

        for (i in 0 until totalQuestions) {
            val questionNumber = i + 1

            var isCorrect = intent.getBooleanExtra("QUESTION_$questionNumber" , true)

            val resultTextView = TextView(this)
            resultTextView.text = "Question $questionNumber: ${if (isCorrect) "Correct" else "Incorrect"}"
            resultLayout.addView(resultTextView)
        }

        val scoreTextView = findViewById<TextView>(R.id.scoreTextView)
        scoreTextView.text = "Your score: $score out of $totalQuestions"
    }
}


