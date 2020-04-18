//package com.example.tictactoe
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Toast
//import kotlinx.android.synthetic.main.activity_main.*
//
//class MainActivity : AppCompatActivity()  {
//
//
//private var i = -1
//
//        override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//
//
//        if (i % 2 == 0) {
//
//        button1.setOnClickListener {
//
//        button1.setText("X")
//
//        i++
//
//
//        }
//
//        button2.setOnClickListener {
//
//        button2.setText("X")
//
//        i++
//
//
//        }
//
//        button3.setOnClickListener {
//
//        button3.setText("X")
//
//        i++
//        }
//
//        button4.setOnClickListener {
//
//        button4.setText("X")
//
//        i++
//
//        }
//
//        button5.setOnClickListener {
//
//        button5.setText("X")
//
//        i++
//
//        }
//
//        button6.setOnClickListener {
//
//        button6.setText("X")
//
//        i++
//
//        }
//
//        button7.setOnClickListener {
//
//        button7.setText("X")
//
//        i++
//
//
//        }
//
//        button8.setOnClickListener {
//
//        button8.setText("X")
//
//        i++
//
//
//        }
//
//        button9.setOnClickListener {
//
//        button9.setText("X")
//
//        i++
//
//        }
//        }//this contains buttons which show X when pressed
//
//        else if (i % 2 != 0) {
//
//
//        button1.setOnClickListener {
//
//        button1.setText("O")
//
//
//        i++
//        }
//
//        button2.setOnClickListener {
//
//        button2.setText("O")
//
//        i++
//
//
//
//        }
//
//        button3.setOnClickListener {
//
//        button3.setText("O")
//
//        i++
//
//
//        }
//
//        button4.setOnClickListener {
//
//        button4.setText("O")
//
//        i++
//
//
//
//        }
//
//        button5.setOnClickListener {
//
//        button5.setText("O")
//
//
//        i++
//
//
//        }
//
//        button6.setOnClickListener {
//
//        button6.setText("O")
//
//        i++
//
//
//
//        }
//
//        button7.setOnClickListener {
//
//        button7.setText("O")
//
//        i++
//
//
//
//        }
//
//        button8.setOnClickListener {
//
//        button8.setText("O")
//
//        i++
//
//        }
//
//        button9.setOnClickListener {
//
//        button9.setText("O")
//
//        i++
//
//        }
//
//
//        }  //this contains buttons which show O when pressed
//
//
//
//
//
//        if( button1.text ==  button5.text && button1.text == button9.text  )  {
//
//        Toast.makeText(this, "hello", Toast.LENGTH_LONG).show()
//        }
//
//
//
//        Buttonexit.setOnClickListener { finish() }
//
//
//        Buttonreset.setOnClickListener{
//
//        Toast.makeText(this, "player", Toast.LENGTH_LONG).show()
//
//
//
//        startActivity(Intent(this, MainActivity::class.java))
//
//        finish()
//
//        }
//
//        }
//        }
