package com.example.flutterapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var counter = 0

        button.setOnClickListener{
            counter++
            textView.text = counter.toString()
        }

        button2.setOnClickListener{
            if(counter > 0)
            {   counter--
                textView.text = counter.toString()   }
        }
    }

}