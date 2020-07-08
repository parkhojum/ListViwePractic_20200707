package com.example.listviwepractic_20200707

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        val myHandler = Handler()
//핸들러 변수를 이용해서 ,3초후레 {} 내부의 내용이 실행되도록

        myHandler.postDelayed({

            //Intent롸 화면 이동
            val myIntent = Intent(mContext,MainActivity::class.java)
            startActivity(myIntent)

            finish()
        },3000)



    }



}