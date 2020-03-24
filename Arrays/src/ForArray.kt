import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    var dizi = Array<Int>(5){0}
    var dizi2 = arrayOf(2,60,40,1)
    var dizi3 = ArrayList<Int>()
    var dizi4 = arrayListOf<Any>()
    dizi[0] = 0
    dizi3.add(0, 1)
    System.arraycopy(dizi2, 0, dizi, 1, dizi2.size)
    dizi4.add(0, "emre")
    dizi4.set(0, "zafer")
    Arrays.sort(dizi)
    for (sayi in dizi){
        println(sayi)
    }
    dizi4.clear()
}