package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()  {


private var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button1.setOnClickListener {


            if (i % 2 == 0){button1.setText("X")}

            else if (i % 2 != 0){button1.setText("O")}

            i++ }


            button2.setOnClickListener {


                if (i % 2 == 0){button2.setText("X")}

                else if (i % 2 != 0){button2.setText("O")}

                i++ }



                button3.setOnClickListener {


                    if (i % 2 == 0){button3.setText("X")}

                    else if (i % 2 != 0){button3.setText("O")}

                    i++ }




                    button4.setOnClickListener {


                        if (i % 2 == 0){button4.setText("X")}

                        else if (i % 2 != 0){button4.setText("O")}

                        i++ }



                        button5.setOnClickListener {


                            if (i % 2 == 0){button5.setText("X")}

                            else if (i % 2 != 0){button5.setText("O")}

                            i++ }


                            button6.setOnClickListener {


                                if (i % 2 == 0){button6.setText("X")}

                                else if (i % 2 != 0){button6.setText("O")}

                                i++ }



                                button7.setOnClickListener {


                                    if (i % 2 == 0){button7.setText("X")}

                                    else if (i % 2 != 0){button7.setText("O")}

                                    i++ }


                                    button8.setOnClickListener {


                                        if (i % 2 == 0){button8.setText("X")}

                                        else if (i % 2 != 0){button8.setText("O")}

                                        i++ }



                                        button9.setOnClickListener {


                                            if (i % 2 == 0){button9.setText("X")}

                                            else if (i % 2 != 0){button9.setText("O")}

                                            i++ }





         //this contains whether to show X or O when pressed on a button


        if( button1.text == "O" && button5.text == "O"  )   run {

            Toast.makeText(this, "hello", Toast.LENGTH_LONG).show()
        }



        Buttonexit.setOnClickListener { finish() }


        Buttonreset.setOnClickListener{

            Toast.makeText(this, "player", Toast.LENGTH_LONG).show()



            startActivity(Intent(this, MainActivity::class.java))

            finish()

        }

    }
}
