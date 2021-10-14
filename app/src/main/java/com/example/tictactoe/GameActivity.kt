package com.example.tictactoe

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.game_layout.*
import kotlin.concurrent.thread

class GameActivity : AppCompatActivity() {
    var startGame = "X"
    var onePressed=0
    var twoPressed=0
    var threePressed=0
    var fourPressed=0
    var fivePressed=0
    var sixPressed=0
    var sevenPressed=0
    var eightPressed=0
    var ninePressed=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_layout)

        val oneButton = findViewById<Button>(R.id.one)
        val twoButton = findViewById<Button>(R.id.two)
        val threeButton = findViewById<Button>(R.id.three)
        val fourButton = findViewById<Button>(R.id.four)
        val fiveButton = findViewById<Button>(R.id.five)
        val sixButton = findViewById<Button>(R.id.six)
        val sevenButton = findViewById<Button>(R.id.seven)
        val eightButton = findViewById<Button>(R.id.eight)
        val nineButton = findViewById<Button>(R.id.nine)
        val exitButton = findViewById<Button>(R.id.exit)

        playerTvOne.setText("Player->X")
        oneButton.setOnClickListener {

            if(onePressed==1){
                oneButton.setClickable(false)
            }else {
                onePressed=1
                oneButton.setText(startGame)
                choosePlayer()
                decideWin()
            }
        }
        twoButton.setOnClickListener {

            if(twoPressed==1){
                twoButton.setClickable(false)
            }else {
                twoPressed=1
                twoButton.setText(startGame)
                choosePlayer()
                decideWin()
            }
        }
        threeButton.setOnClickListener {

            if(threePressed==1){
                threeButton.setClickable(false)
            }else {
                threePressed=1
                threeButton.setText(startGame)
                choosePlayer()
                decideWin()
            }
        }
        four.setOnClickListener {

            if(fourPressed==1){
                fourButton.setClickable(false)
            }else {
                fourPressed=1
                fourButton.setText(startGame)
                choosePlayer()
                decideWin()
            }
        }
        five.setOnClickListener {

            if(fivePressed==1){
                fiveButton.setClickable(false)
            }else {
                fivePressed=1
                fiveButton.setText(startGame)
                choosePlayer()
                decideWin()
            }
        }
        six.setOnClickListener {

            if(sixPressed==1){
                sixButton.setClickable(false)
            }else {
                sixPressed=1
                sixButton.setText(startGame)
                choosePlayer()
                decideWin()
            }
        }
        seven.setOnClickListener {

            if(sevenPressed==1){
                sevenButton.setClickable(false)
            }else {
                sevenPressed=1
                sevenButton.setText(startGame)
                choosePlayer()
                decideWin()
            }
        }
        eightButton.setOnClickListener {

            if(eightPressed==1){
                eightButton.setClickable(false)
            }else {
                eightPressed=1
                eightButton.setText(startGame)
                choosePlayer()
                decideWin()
            }
        }
        nine.setOnClickListener {

            if(ninePressed==1){
                nineButton.setClickable(false)
            }else {
                ninePressed=1
                nineButton.setText(startGame)
                choosePlayer()
                decideWin()
            }
        }
        exitButton.setOnClickListener {
            finish()
        }
        reset.setOnClickListener {
            reset()
        }
    }
    fun reset(){
        one.setText("")
        two.setText("")
        three.setText("")
        four.setText("")
        five.setText("")
        six.setText("")
        seven.setText("")
        eight.setText("")
        nine.setText("")

        onePressed=0
        twoPressed=0
        threePressed=0
        fourPressed=0
        fivePressed=0
        sixPressed=0
        sevenPressed=0
        eightPressed=0
        ninePressed=0

        setEnable()
        playerTvOne.setText("Player->X")
        playerTvTwo.setText("")
        if(startGame.equals("O")){
            startGame="X"
        }
    }
    fun choosePlayer() {
        if (startGame.equals("X")) {
            startGame = "O"
            playerTvOne.setText("")
            playerTvTwo.setText("Player->O")

        } else {
            startGame = "X"
            playerTvOne.setText("Player->X")
            playerTvTwo.setText("")
        }
    }
    fun decideWin() {

        if ((one.text.toString()).equals("X") && (two.text.toString()).equals("X") && (three.text.toString()).equals("X")) {
           playerTvOne.setText("Player->X Wins")
            playerTvTwo.setText("Reset to Play Again")
            setDisable()
            one.setTextColor(Color.parseColor("#FFFF00"))
            two.setTextColor(Color.parseColor("#FFFF00"))
            three.setTextColor(Color.parseColor("#FFFF00"))
        } else if ((four.text.toString()).equals("X") && (five.text.toString()).equals("X") && (six.text.toString()).equals("X")) {
            playerTvOne.setText("Player->X Wins")
            playerTvTwo.setText("Reset to Play Again")
            setDisable()
            four.setTextColor(Color.parseColor("#FFFF00"))
            five.setTextColor(Color.parseColor("#FFFF00"))
            six.setTextColor(Color.parseColor("#FFFF00"))
        } else if ((seven.text.toString()).equals("X") && (eight.text.toString()).equals("X") && (nine.text.toString()).equals("X")) {
           playerTvOne.setText("Player->X Wins")
            playerTvTwo.setText("Reset to Play Again")
            setDisable()
            seven.setTextColor(Color.parseColor("#FFFF00"))
            eight.setTextColor(Color.parseColor("#FFFF00"))
            nine.setTextColor(Color.parseColor("#FFFF00"))
        } else if ((one.text.toString()).equals("X") && (four.text.toString()).equals("X") && (seven.text.toString()).equals("X")) {
           playerTvOne.setText("Player->X Wins")
            playerTvTwo.setText("Reset to Play Again")
            setDisable()
            one.setTextColor(Color.parseColor("#FFFF00"))
            four.setTextColor(Color.parseColor("#FFFF00"))
            seven.setTextColor(Color.parseColor("#FFFF00"))
        } else if ((two.text.toString()).equals("X") && (five.text.toString()).equals("X") && (eight.text.toString()).equals("X")) {
           playerTvOne.setText("Player->X Wins")
            playerTvTwo.setText("Reset to Play Again")
            setDisable()
            two.setTextColor(Color.parseColor("#FFFF00"))
            five.setTextColor(Color.parseColor("#FFFF00"))
            eight.setTextColor(Color.parseColor("#FFFF00"))
        }else if((three.text.toString()).equals("X") && (six.text.toString()).equals("X") && (nine.text.toString()).equals("X")){
           playerTvOne.setText("Player->X Wins")
            playerTvTwo.setText("Reset to Play Again")
            setDisable()
            three.setTextColor(Color.parseColor("#FFFF00"))
            six.setTextColor(Color.parseColor("#FFFF00"))
            nine.setTextColor(Color.parseColor("#FFFF00"))
        }else if((one.text.toString()).equals("X") && (five.text.toString()).equals("X") && (nine.text.toString()).equals("X")){
           playerTvOne.setText("Player->X Wins")
            playerTvTwo.setText("Reset to Play Again")
            setDisable()
            one.setTextColor(Color.parseColor("#FFFF00"))
            five.setTextColor(Color.parseColor("#FFFF00"))
            nine.setTextColor(Color.parseColor("#FFFF00"))

        }else if((three.text.toString()).equals("X") && (five.text.toString()).equals("X") && (seven.text.toString()).equals("X")){
           playerTvOne.setText("Player->X Wins")
            playerTvTwo.setText("Reset to Play Again")
            setDisable()
            three.setTextColor(Color.parseColor("#FFFF00"))
            five.setTextColor(Color.parseColor("#FFFF00"))
            seven.setTextColor(Color.parseColor("#FFFF00"))
        }else{

            if ((one.text.toString()).equals("O") && (two.text.toString()).equals("O") && (three.text.toString()).equals("O")) {
                playerTvOne.setText("Player->O Wins")
                playerTvTwo.setText("Reset to Play Again")
                setDisable()
                one.setTextColor(Color.parseColor("#FFFF00"))
                two.setTextColor(Color.parseColor("#FFFF00"))
                three.setTextColor(Color.parseColor("#FFFF00"))
            } else if ((four.text.toString()).equals("O") && (five.text.toString()).equals("O") && (six.text.toString()).equals("O")) {
                playerTvOne.setText("Player->O Wins")
                playerTvTwo.setText("Reset to Play Again")
                setDisable()
                four.setTextColor(Color.parseColor("#FFFF00"))
                five.setTextColor(Color.parseColor("#FFFF00"))
                six.setTextColor(Color.parseColor("#FFFF00"))

            } else if ((seven.text.toString()).equals("O") && (eight.text.toString()).equals("O") && (nine.text.toString()).equals("O")) {
                playerTvOne.setText("Player->O Wins")
                playerTvTwo.setText("Reset to Play Again")
                setDisable()
                seven.setTextColor(Color.parseColor("#FFFF00"))
                eight.setTextColor(Color.parseColor("#FFFF00"))
                nine.setTextColor(Color.parseColor("#FFFF00"))

            } else if ((one.text.toString()).equals("O") && (four.text.toString()).equals("O") && (seven.text.toString()).equals("O")) {
                playerTvOne.setText("Player->O Wins")
                playerTvTwo.setText("Reset to Play Again")
                setDisable()
                one.setTextColor(Color.parseColor("#FFFF00"))
                four.setTextColor(Color.parseColor("#FFFF00"))
                seven.setTextColor(Color.parseColor("#FFFF00"))

            } else if ((two.text.toString()).equals("O") && (five.text.toString()).equals("O") && (eight.text.toString()).equals("O")) {
                playerTvOne.setText("Player->O Wins")
                playerTvTwo.setText("Reset to Play Again")
                setDisable()
                two.setTextColor(Color.parseColor("#FFFF00"))
                five.setTextColor(Color.parseColor("#FFFF00"))
                eight.setTextColor(Color.parseColor("#FFFF00"))

            }else if((three.text.toString()).equals("O") && (six.text.toString()).equals("O") && (nine.text.toString()).equals("O")){
                playerTvOne.setText("Player->O Wins")
                playerTvTwo.setText("Reset to Play Again")
                setDisable()
                three.setTextColor(Color.parseColor("#FFFF00"))
                six.setTextColor(Color.parseColor("#FFFF00"))
                nine.setTextColor(Color.parseColor("#FFFF00"))

            }else if((one.text.toString()).equals("O") && (five.text.toString()).equals("O") && (nine.text.toString()).equals("O")){
                playerTvOne.setText("Player->O Wins")
                playerTvTwo.setText("Reset to Play Again")
                setDisable()
                one.setTextColor(Color.parseColor("#FFFF00"))
                five.setTextColor(Color.parseColor("#FFFF00"))
                nine.setTextColor(Color.parseColor("#FFFF00"))

            }else if((three.text.toString()).equals("O") && (five.text.toString()).equals("O") && (seven.text.toString()).equals("O")){
                playerTvOne.setText("Player->O Wins")
                playerTvTwo.setText("Reset to Play Again")
                setDisable()
                three.setTextColor(Color.parseColor("#FFFF00"))
                five.setTextColor(Color.parseColor("#FFFF00"))
                seven.setTextColor(Color.parseColor("#FFFF00"))

            }else if(onePressed==1 && twoPressed==1 && threePressed==1 && fourPressed==1 &&
                    ninePressed==1 && sevenPressed==1 && sixPressed==1 && fivePressed==1 &&
                    eightPressed==1 ){
                    playerTvOne.setText("Match Draw")
                    playerTvTwo.setText("Reset to Play Again")

            }
        }
    }
    fun setEnable(){
        one.setClickable(true)
        two.setClickable(true)
        three.setClickable(true)
        four.setClickable(true)
        five.setClickable(true)
        six.setClickable(true)
        seven.setClickable(true)
        eight.setClickable(true)
        nine.setClickable(true)
        one.setTextColor(Color.parseColor("#ffffff"))
        two.setTextColor(Color.parseColor("#ffffff"))
        three.setTextColor(Color.parseColor("#ffffff"))
        four.setTextColor(Color.parseColor("#ffffff"))
        five.setTextColor(Color.parseColor("#ffffff"))
        six.setTextColor(Color.parseColor("#ffffff"))
        seven.setTextColor(Color.parseColor("#ffffff"))
        eight.setTextColor(Color.parseColor("#ffffff"))
        nine.setTextColor(Color.parseColor("#ffffff"))
    }
    fun setDisable(){
        one.setClickable  (false)
        two.setClickable  (false)
        three.setClickable(false)
        four.setClickable (false)
        five.setClickable (false)
        six.setClickable  (false)
        seven.setClickable(false)
        eight.setClickable(false)
        nine.setClickable (false)
    }
}