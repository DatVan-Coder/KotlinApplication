package fpoly.locnv27.kotlinapplication.modo

import kotlinx.parcelize.Parcelize

class Podut {
    data class Product(val id:Int, val name:String,val price:String, val image: String)
}
//@Parcelize
//data class Poduct (val id:Int,
//    val name: String,
//    val price: String,
//    val avata:String)