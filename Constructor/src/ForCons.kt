class Ogrenci (yas :Int, isim :String) {
    var ogrenci_ad : String
    var ogrenci_yas : Int
    init {
        println("İnitten gelen Öğrenci bilgisi => Adı : $isim, Yaşı : $yas")
        ogrenci_yaz(yas, isim)
        this.ogrenci_ad = isim
        this.ogrenci_yas = yas
    }

    fun ogrenci_yaz(yasi : Int, ismi : String): Unit {
        println("Fundan gelen Öğrenci bilgisi => Adı : $ismi, Yaşı : $yasi")
    }
    fun this_ogrenci(): Unit {
        println("This öğrenciden gelen Öğrenci bilgisi => Adı : ${this.ogrenci_ad}, Yaşı : ${this.ogrenci_yas}")
    }
}

fun main(args: Array<String>) {
    var ogrenci : Ogrenci = Ogrenci(22, "emre")
    ogrenci.this_ogrenci()
}