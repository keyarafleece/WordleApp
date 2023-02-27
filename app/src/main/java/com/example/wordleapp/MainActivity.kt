package com.example.wordleapp

import android.graphics.Color
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    //var guessState = EvaluateGuesses.EvaluateGuesses.toggleGuessState()

    var wordToGuess = FourLetterWordList.FourLetterWordList.getRandomFourLetterWord()
    // This is for stacking the game so that I can make a video showing the winning guess.
     // var wordToGuess = "BEAD"




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val checkGuessButton = findViewById<Button>(R.id.checkGuessButton)
        val checkGuessTwoButton = findViewById<Button>(R.id.checkGuess2Button)
        val checkGuessThreeButton = findViewById<Button>(R.id.checkGuess3Button)
        // var guessCounter = 0
       /*
       var isGuess1 = true
        var isGuess2 = false
        var isGuess3 = false
        */

// Background Animation
        val constraintLayout: ConstraintLayout = findViewById(R.id.mainLayout)
        val animationDrawable: AnimationDrawable = constraintLayout.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(5000)
        animationDrawable.setExitFadeDuration(5000)
        animationDrawable.start()

        val edt1 = findViewById<View>(R.id.edt_1) as EditText
        val edt2 = findViewById<View>(R.id.edt_2) as EditText
        val edt3 = findViewById<View>(R.id.edt_3) as EditText
        val edt4 = findViewById<View>(R.id.edt_4) as EditText

        val edt5 = findViewById<View>(R.id.edt_5) as EditText
        val edt6 = findViewById<View>(R.id.edt_6) as EditText
        val edt7 = findViewById<View>(R.id.edt_7) as EditText
        val edt8 = findViewById<View>(R.id.edt_8) as EditText

        val edt9 = findViewById<View>(R.id.edt_9) as EditText
        val edt10 = findViewById<View>(R.id.edt_10) as EditText
        val edt11 = findViewById<View>(R.id.edt_11) as EditText
        val edt12 = findViewById<View>(R.id.edt_12) as EditText




        /*
        var guess2Index1 = edt5.text.toString().uppercase()
        var guess2Index2 = edt6.text.toString().uppercase()
        var guess2Index3 = edt7.text.toString().uppercase()
        var guess2Index4 = edt8.text.toString().uppercase()

        var guess3Index1 = edt9.text.toString().uppercase()
        var guess3Index2 = edt10.text.toString().uppercase()
        var guess3Index3 = edt11.text.toString().uppercase()
        var guess3Index4 = edt12.text.toString().uppercase()
        */


       // var guess2 = "$guess2Index1$guess2Index2$guess2Index3$guess2Index4"
       // var guess3 = "$guess3Index1$guess3Index2$guess3Index3$guess3Index4"







       checkGuessButton.setOnClickListener {

           var guessIndex1 = edt1.text.toString().uppercase()
           var guessIndex2 = edt2.text.toString().uppercase()
           var guessIndex3 = edt3.text.toString().uppercase()
           var guessIndex4 = edt4.text.toString().uppercase()



          var guess1 = "$guessIndex1$guessIndex2$guessIndex3$guessIndex4"

           /* guessCounter++



           when (guessCounter) {
               1 -> {
                   isGuess1 = true
               }
               2 -> {
                   isGuess1 = false
                   isGuess2 = true
                   println("It's Guess 2 now!!")
               }

               3 -> {
                   isGuess1 = false
                   isGuess2 = false
                   isGuess3 = true
                   println("It's Guess 3 now!!")
               }

           }*/

           val s = checkGuess(guess1)
           val index1 = s[0]
           val index2 = s[1]
           val index3 = s[2]
           val index4 = s[3]


           when (index1.toChar()) {

               'X' -> edt1.setBackgroundResource(R.drawable.edit_text_style_x)
               'O' -> edt1.setBackgroundResource(R.drawable.edit_text_style_o)
               '+' -> edt1.setBackgroundResource(R.drawable.edit_text_style_plus)

           }

           when (index2.toChar()) {

               'X' -> edt2.setBackgroundResource(R.drawable.edit_text_style_x)
               'O' -> edt2.setBackgroundResource(R.drawable.edit_text_style_o)
               '+' -> edt2.setBackgroundResource(R.drawable.edit_text_style_plus)

           }

           when (index3.toChar()) {

               'X' -> edt3.setBackgroundResource(R.drawable.edit_text_style_x)
               'O' -> edt3.setBackgroundResource(R.drawable.edit_text_style_o)
               '+' -> edt3.setBackgroundResource(R.drawable.edit_text_style_plus)

           }

           when (index4.toChar()) {

               'X' -> edt4.setBackgroundResource(R.drawable.edit_text_style_x)
               'O' -> edt4.setBackgroundResource(R.drawable.edit_text_style_o)
               '+' -> edt4.setBackgroundResource(R.drawable.edit_text_style_plus)

           }

           when (s) {
               "OOOO" -> {
                   Toast.makeText(applicationContext, "You Won!!!", Toast.LENGTH_LONG).show()
                   constraintLayout.setBackgroundResource(R.drawable.you_won_gradient_list)
               }
           }
       }

        checkGuessTwoButton.setOnClickListener {

            var guess2Index1 = edt5.text.toString().uppercase()
            var guess2Index2 = edt6.text.toString().uppercase()
            var guess2Index3 = edt7.text.toString().uppercase()
            var guess2Index4 = edt8.text.toString().uppercase()

            var guess2 = "$guess2Index1$guess2Index2$guess2Index3$guess2Index4"

            val a = checkGuess(guess2)
            val indexA1 = a[0]
            val indexA2 = a[1]
            val indexA3 = a[2]
            val indexA4 = a[3]

            when (indexA1.toChar()) {

                'X' -> edt5.setBackgroundResource(R.drawable.edit_text_style_x)
                'O' -> edt5.setBackgroundResource(R.drawable.edit_text_style_o)
                '+' -> edt5.setBackgroundResource(R.drawable.edit_text_style_plus)

            }

            when (indexA2.toChar()) {

                'X' -> edt6.setBackgroundResource(R.drawable.edit_text_style_x)
                'O' -> edt6.setBackgroundResource(R.drawable.edit_text_style_o)
                '+' -> edt6.setBackgroundResource(R.drawable.edit_text_style_plus)

            }

            when (indexA3.toChar()) {

                'X' -> edt7.setBackgroundResource(R.drawable.edit_text_style_x)
                'O' -> edt7.setBackgroundResource(R.drawable.edit_text_style_o)
                '+' -> edt7.setBackgroundResource(R.drawable.edit_text_style_plus)

            }

            when (indexA4.toChar()) {

                'X' -> edt8.setBackgroundResource(R.drawable.edit_text_style_x)
                'O' -> edt8.setBackgroundResource(R.drawable.edit_text_style_o)
                '+' -> edt8.setBackgroundResource(R.drawable.edit_text_style_plus)

            }

            when (guess2) {
                "OOOO" -> Toast.makeText(applicationContext, "You Won!!!", Toast.LENGTH_LONG).show()
            }

        }

        checkGuessThreeButton.setOnClickListener {

            var guess3Index1 = edt9.text.toString().uppercase()
            var guess3Index2 = edt10.text.toString().uppercase()
            var guess3Index3 = edt11.text.toString().uppercase()
            var guess3Index4 = edt12.text.toString().uppercase()

            var guess3 = "$guess3Index1$guess3Index2$guess3Index3$guess3Index4"

            val m = checkGuess(guess3)
            val indexM1 = m[0]
            val indexM2 = m[1]
            val indexM3 = m[2]
            val indexM4 = m[3]

            when (indexM1.toChar()) {

                'X' -> edt9.setBackgroundResource(R.drawable.edit_text_style_x)
                'O' -> edt9.setBackgroundResource(R.drawable.edit_text_style_o)
                '+' -> edt9.setBackgroundResource(R.drawable.edit_text_style_plus)

            }

            when (indexM2.toChar()) {

                'X' -> edt10.setBackgroundResource(R.drawable.edit_text_style_x)
                'O' -> edt10.setBackgroundResource(R.drawable.edit_text_style_o)
                '+' -> edt10.setBackgroundResource(R.drawable.edit_text_style_plus)

            }

            when (indexM3.toChar()) {

                'X' -> edt11.setBackgroundResource(R.drawable.edit_text_style_x)
                'O' -> edt11.setBackgroundResource(R.drawable.edit_text_style_o)
                '+' -> edt11.setBackgroundResource(R.drawable.edit_text_style_plus)

            }

            when (indexM4.toChar()) {

                'X' -> edt12.setBackgroundResource(R.drawable.edit_text_style_x)
                'O' -> edt12.setBackgroundResource(R.drawable.edit_text_style_o)
                '+' -> edt12.setBackgroundResource(R.drawable.edit_text_style_plus)

            }

            when (guess3){
                "OOOO" -> Toast.makeText(applicationContext, "You Won!!!", Toast.LENGTH_LONG).show()
                else -> Toast.makeText(applicationContext, "The word is $wordToGuess", Toast.LENGTH_LONG).show()
            }

        }

    }


/**
* Parameters / Fields:
*   wordToGuess : String - the target word the user is trying to guess
*   guess : String - what the user entered as their guess
*
* Returns a String of 'O', '+', and 'X', where:
*   'O' represents the right letter in the right place
*   '+' represents the right letter in the wrong place
*   'X' represents a letter not in the target word
*/
private fun checkGuess(guess: String) : String {
var result = ""
for (i in 0..3) {
if (guess[i] == wordToGuess[i]) {
   result += "O"
}
else if (guess[i] in wordToGuess) {
   result += "+"
}
else {
   result += "X"
}
}
return result
}

}