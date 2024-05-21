package com.example.kojpy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class biologyquiz : AppCompatActivity() {

    private lateinit var questionTextView: TextView
    private lateinit var optionsRadioGroup: RadioGroup
    private lateinit var nextButton: Button

    private lateinit var questions: List<Question>
    private var currentQuestionIndex = 0
    private var score = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biologyquiz)





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
            Question(" Which part of the plant grows underground?", listOf("Leaf", "Stem", "I do not know", "Root"), 0),
            Question("What do plants need to make their food?", listOf("Water, sunlight, and soil", "Rocks, air, and water", "Rocks, air, and water", "Water, sunlight, and air"), 0),
            Question("Which animal is known for its long neck?", listOf("Elephant", "Lion", "Giraffe", "Monkey"), 1),
            Question("Which part of the body helps you to see?", listOf(" Eyes", "Nose", "Mouth", "Ears"), 3),
            Question("What do bees collect from flowers to make honey?", listOf(" Water", "Nectar", "Milk", "Seeds"), 2)
        )



















    }
}