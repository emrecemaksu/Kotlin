fun main(args: Array<String>) {
    var yasım : Int = yas_dondur(20)
    yas_metodu("20", 20)
    println(yasım)
    var bool : Boolean = dogruyanlis(true)
    println(bool)
}

fun yas_dondur(sayi : Int) : Int{
    return sayi
}
fun dogruyanlis(karar : Boolean) : Boolean {
    return karar
}