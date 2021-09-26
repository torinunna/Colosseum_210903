package com.yujin.colosseum_210903

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yujin.colosseum_210903.utils.ServerUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        signInBtn.setOnClickListener {

            val inputId = emailEdt.text.toString()
            val inputPw = passwordEdt.text.toString()

        }



    }

    override fun setValues() {

    }
}