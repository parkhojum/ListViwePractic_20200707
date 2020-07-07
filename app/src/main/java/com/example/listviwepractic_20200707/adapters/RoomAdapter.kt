package com.example.listviwepractic_20200707.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.listviwepractic_20200707.R
import com.example.listviwepractic_20200707.datas.Room

class RoomAdapter(val mContext: Context, val resId: Int,
                  val mList: List<Room>) : ArrayAdapter<Room>(mContext,resId,mList) {


    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.room_list_item,null)
        }

        val row = tempRow!!

        val data = mList[position]

        val priceTxt = row.findViewById<TextView>(R.id. pe)
        val addressAndFloorTxt = row.findViewById<>()

        return row
    }

}