open class insan(yas : Int, isim : String) {
    var isim : String
    var yas : Int
    init {
        println("İnit bloğu önce çalıştı.")
        this.isim = isim
        this.yas = yas
    }
}

class Ogretmen(ad : String, yasi : Int, erkekmi : Boolean): insan(yasi, ad) {
    var erkek : Boolean
    init {
        println("İkinci İnit bloğu çalıştı.")
        this.erkek = erkekmi
        if (erkek) println("Bu öğretmen bir erkek.")
        else println("Bu öğretmen bir erkek değil.")
    }
}

fun main() {
    var ogretmen : Ogretmen = Ogretmen("emre", 22, true)
    println(ogretmen.isim)
    println(ogretmen.erkek)
}