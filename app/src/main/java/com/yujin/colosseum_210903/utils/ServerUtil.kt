package com.yujin.colosseum_210903.utils

import android.util.Log
import okhttp3.*
import org.json.JSONObject
import java.io.IOException
import java.util.logging.Handler

class ServerUtil  {

    interface JsonResponseHandler {
        fun onResponse( jsonObj : JSONObject )
    }


    companion object {

       private val HOST_URL = "http://54.180.52.26"

        fun postRequestSignIn( id : String, pw : String, handler : JsonResponseHandler?) {

            val urlString = "${HOST_URL}/user"

            val formData = FormBody.Builder()
                .add("email", id)
                .add("password", pw)
                .build()

            val request = Request.Builder()
                .url(urlString)
                .post(formData)
                .build()

            val client = OkHttpClient()

            client.newCall(request).enqueue(object : Callback {

                override fun onFailure(call: Call, e: IOException) {

                }

                override fun onResponse(call: Call, response: Response) {

                    val bodyString = response.body!!.string()

                    val jsonObj = JSONObject(bodyString)

                    Log.d("서버응답본문", jsonObj.toString())

                    handler?.onResponse(jsonObj)






                }


        })


    }

 }
}