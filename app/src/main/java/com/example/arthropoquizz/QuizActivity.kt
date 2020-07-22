package com.example.arthropoquizz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_quiz.*

class QuizzActivity : AppCompatActivity() {

    var quizzes = ArrayList<Quiz>()
    var numberOfGoodAnswers: Int = 0
    var currentQuizIndex: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)


        quizzes.add(Quiz("Combien de pattes ont les insectes ?", "4", "6", "8",2))
        quizzes.add(Quiz("Lequel de ces arthropodes n'est pas un insecte ?", "la Mygale", "la Coccinelle", "la Fourmi",1))
        quizzes.add(Quiz("De quelle classe font partis les scorpions ?", "les Insectes", "les Crustacés", "les arachnides",3))
        quizzes.add(Quiz("Lequel de ces insectes ne peut pas voler ?", "La libellule", "La fourmi", "le phasme",3))
        quizzes.add(Quiz("Lequel des ces arthropodes est un myriapode ?", "Le Iule", "le Cloporte", "le Papillon",1))
        quizzes.add(Quiz("Que mangent les libellules ?", "Des Fleurs", "Des Fruits", "des Insectes",3))
        quizzes.add(Quiz("Lequel des ces Arthropodes n'est pas un Crustacé  ?", "Le Cloporte", "Le Crabe", "Le Glomeris",3))
    }

    fun showQuestion(quiz: Quiz){
        txtQuestion.setText(quiz.Question)
        answer1.setText(quiz.answer1)
        answer2.setText(quiz.answer2)
        answer3.setText(quiz.answer3)
    }
}