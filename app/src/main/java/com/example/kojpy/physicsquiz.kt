package com.example.kojpy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class physicsquiz : AppCompatActivity() {


    private lateinit var questionTextView: TextView
    private lateinit var optionsRadioGroup: RadioGroup
    private lateinit var nextButton: Button

    private lateinit var questions: List<Question>
    private var currentQuestionIndex = 0
    private var score = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_physicsquiz)





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
            Question(" What is the main source of light on Earth?", listOf(" Moon", "Star", "Fire flies", "Sun"), 0),
            Question("Which of these objects can be attracted by a magnet?", listOf("Wooden stick", "Iron Nail", "Glass", "Rubber band"), 2),
            Question("What happens when you push a toy car on the floor?", listOf(" It stops immediately", " It moves forward", "It moves backward", "It floats in the air"), 0),
            Question("What is it called when water changes from liquid to gas?", listOf("Evaporation", "Freezing", "Condensation", "Boiling"), 3),
            Question("What do we use to measure time?", listOf("Calculator", "Clock", "Ruler", "Beam balance"), 2)
        )







    }
}