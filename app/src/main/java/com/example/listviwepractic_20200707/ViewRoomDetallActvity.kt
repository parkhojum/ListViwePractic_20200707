package com.example.listviwepractic_20200707

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviwepractic_20200707.datas.Room

class ViewRoomDetallActvity : BaseActivity() {
    override fun setupEvents() {

    }

    override fun setValues() {
        val receivdRoom = intent.getSerializableExtra("room") as Room
        receivdRoom.price
    }



}