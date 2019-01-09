package com.example.mvvm_basic

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), Observer {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = CalculatorViewModel()
        viewModel.addObserver(this)

        viewModel.deleteObserver(this)

        btnAdd.setOnClickListener {
            viewModel.add(etNumberOne.text.toString(), etNumberTwo.text.toString())
        }

        btnSubtract.setOnClickListener {

        }

        btnMultiply.setOnClickListener {

        }

    }

    override fun update(o: Observable?, result: Any?) {
        tvResult.text = (result as Int).toString()
    }
}
