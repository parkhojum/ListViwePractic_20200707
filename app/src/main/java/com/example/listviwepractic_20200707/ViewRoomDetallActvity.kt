package com.example.listviwepractic_20200707

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviwepractic_20200707.datas.Room
import kotlinx.android.synthetic.main.activity_view_room_detall_actvity.*
import kotlinx.android.synthetic.main.room_list_item.*
import kotlinx.android.synthetic.main.room_list_item.descTxt

class ViewRoomDetallActvity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detall_actvity)
        setupEvents()
        setValues()
    }
    override fun setupEvents() {

    }

    override fun setValues() {
        val receivdRoom = intent.getSerializableExtra("room") as Room
        receivdRoom.price

        priceTxt.text = receivdRoom.getFormattedPrice()
        descTxt.text = receivdRoom.description
        addressTxt.text = receivdRoom.address
        floorTxt.text = receivdRoom.getFormattedFloor()
    }



}