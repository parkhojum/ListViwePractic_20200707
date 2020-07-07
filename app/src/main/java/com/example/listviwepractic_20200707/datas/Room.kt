package com.example.listviwepractic_20200707.datas

class Room(val price:Int,val address:String,val floor:Int,val description:String) {

fun getFormattedFloor():String{
    if (this.floor >= 1) {
        return "${this.floor}층"
    }
    else if (this.floor == 0) {
        return "반지하"
    }
    else{

        return "지하 ${-this.floor}지하"
    }
}


fun getFormattedPrice() :String{
    //1억이 넘나 아니야에 따라 다르게 가공.
    if (this.price >= 10000) {


        //?억?만원 양식 가공
        //몇억? 85000  / 100000=> 8.5 (Int - 소수점 버림) => 8억
        //몇 만원? 89999 % 100000=> 9999
        val uk = this.price / 10000
        val rest = this.price % 10000

        return String.format("%d억 %,d만원",uk , rest)
    }
    else{
        //1억이 안되는 경우 => 8,500만원 등으로 가공.
        //숫저에 컴마, 만원 붙이기.
        return String.format("%,d만원",this.price)
    }

}


}