package com.example.listviwepractic_20200707

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviwepractic_20200707.adapters.RoomAdapter
import com.example.listviwepractic_20200707.datas.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    
    val mRoomList = ArrayList<Room>()

    lateinit var mRoomAdapter: RoomAdapter
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        
        roomListViwe.setOnItemClickListener { parent, view, position, id ->
            val clickedRoom = mRoomList[position]

            //눌린 방의 정보를 상세화면에 전달



            val myIntent = Intent(mContext,ViewRoomDetallActvity::class.java)

            //putExtra로 방 정보 첨부 => 방데이터를 한꺼번에 첨부
            myIntent.putExtra("room",clickedRoom)


            startActivity(myIntent)

        }


    }

    override fun setValues() {
        
        mRoomList.add(Room(8000,"서울시 마포구",5,"첫번째 방 입니다."))
        mRoomList.add(Room(25000,"서울시 마포구",0,"두번째 방 입니다."))
        mRoomList.add(Room(7800,"서울시 마포구",-1,"세번째 방 입니다."))
        mRoomList.add(Room(53000,"서울시 강서구",2,"네번째 방 입니다."))
        mRoomList.add(Room(15000,"서울시 강서구",3,"다섯번째 방 입니다."))
        mRoomList.add(Room(4000,"서울시 종로구",-2,"여섯번째 방 입니다."))
        mRoomList.add(Room(3000,"서울시 종로구",7,"일곱번째 방 입니다."))
        mRoomList.add(Room(44000,"서울시 종로구",15,"여덟번째 방 입니다."))

        mRoomAdapter = RoomAdapter(mContext,R.layout.room_list_item,mRoomList)
        roomListViwe.adapter = mRoomAdapter

    }


    }
