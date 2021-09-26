package com.yujin.colosseum_210903

import android.os.Bundle
import android.util.Log
import com.yujin.colosseum_210903.utils.ServerUtil
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject

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

            ServerUtil.postRequestSignIn(inputId, inputPw, object : ServerUtil.JsonResponseHandler {

                override fun onResponse(jsonObj: JSONObject) {

                    Log.d("화면에서받은JSON", jsonObj.toString())

                }

            } )

        }



    }

    override fun setValues() {

    }
}