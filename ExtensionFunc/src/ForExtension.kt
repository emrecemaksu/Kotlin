fun main() {
    var isim = "Emre Cem                   AKSU"
    println("5 sayısının 0'a kadar toplamı => ${5.SifiraKadarTopla()}")
    println("İsmin boşluk azaltılmış hali => ${isim.BolukAzalt()}")
    var emre : YetenekAvcisi = YetenekAvcisi()
    emre.yetenek = "Kotlin"
    emre.YetenekYaz()
    var kazim : YetenekAvcisi = YetenekAvcisi()
    kazim.yetenek = "AutoCAD"
    var nisan: YetenekAvcisi
    nisan = emre.YetenekBirlestir(kazim)
    nisan.YetenekYaz()
    var mehmet : YetenekAvcisi
    mehmet = emre YetenekBirlestir_2 nisan
    mehmet.YetenekYaz()
}

fun Int.SifiraKadarTopla() : Int {
    var toplam : Int = 0
    for (i in 0..this) toplam += i
    return toplam
}

fun String.BolukAzalt() : String {
    var regex : Regex = Regex("\\s+")
    return regex.replace(this, " ")
}

class YetenekAvcisi{
    var yetenek : String = ""
    fun YetenekYaz(): Unit {
        println("Benim yeteneğim => $yetenek")
    }
}

fun YetenekAvcisi.YetenekBirlestir(yetenekli : YetenekAvcisi) : YetenekAvcisi {
    var birlestir = YetenekAvcisi()
    birlestir.yetenek = this.yetenek + " " + yetenekli.yetenek
    return birlestir
}

infix fun YetenekAvcisi.YetenekBirlestir_2(yetenekli : YetenekAvcisi) : YetenekAvcisi {
    var birlestir = YetenekAvcisi()
    birlestir.yetenek = this.yetenek + " " + yetenekli.yetenek
    return birlestir
}