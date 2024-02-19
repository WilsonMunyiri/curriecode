package com.example.kojpy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class chemistrygrade4quiz : AppCompatActivity() {

    private lateinit var questionTextView: TextView
    private lateinit var optionsRadioGroup: RadioGroup
    private lateinit var nextButton: Button

    private lateinit var questions: List<Question>
    private var currentQuestionIndex = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chemistrygrade4quiz)

        // Initialize views
        questionTextView = findViewById(R.id.questionTextView)
        optionsRadioGroup = findViewById(R.id.optionsRadioGroup)
        nextButton = findViewById(R.id.nextButton)

        // Initialize questions
        questions = generateQuestions()

        // Display the first question
        displayQuestion()

        // Set click listener for Next button
        nextButton.setOnClickListener {
            val checkedRadioButtonId = optionsRadioGroup.checkedRadioButtonId
            if (checkedRadioButtonId != -1) {
                val selectedOptionIndex = optionsRadioGroup.indexOfChild(findViewById<RadioButton>(checkedRadioButtonId))
                checkAnswer(selectedOptionIndex)
            } else {
                Toast.makeText(this, "Please select an option", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun displayQuestion() {
        if (currentQuestionIndex < questions.size) {
            val question = questions[currentQuestionIndex]
            questionTextView.text = question.question
            optionsRadioGroup.clearCheck() // Clear selected radio button
            for (i in 0 until optionsRadioGroup.childCount) {
                val radioButton = optionsRadioGroup.getChildAt(i) as RadioButton
                radioButton.text = question.options[i]
            }
        } else {
            // Launch ResultActivity
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("SCORE", score)
            intent.putExtra("TOTAL_QUESTIONS", questions.size)
            startActivity(intent)
            finish() // Finish the current activity
        }
    }

    private fun checkAnswer(selectedOptionIndex: Int) {
        val question = questions[currentQuestionIndex]
        if (question.correctOptionIndex == selectedOptionIndex) {
            score++
        }
        currentQuestionIndex++
        displayQuestion()
    }

    private fun generateQuestions(): List<Question> {
        return listOf(
            Question("What is one 1 + 1?", listOf("4", "11", "1", "2"), 3),
            Question("What is 5 - 3?", listOf("8", "2", "4", "0"), 1),
            Question("Who wrote 'To Kill a Mockingbird'?", listOf("Harper Lee", "Jane Austen", "Charles Dickens", "Mark Twain"), 0),
            Question("What is the chemical symbol for water?", listOf("O", "W", "H2O", "H"), 2),
            Question("Which of the following is not a primary color?", listOf("Red", "Blue", "Green", "Yellow"), 1)
        )


    }
}