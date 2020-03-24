open class Dortgen(){
    var en : Int = 0
    var boy : Int = 0

    open fun alan_hesapla(): Unit {
        println("Dortgenin alanı => ${en * boy}")
    }
}

class Dikdortgen : Dortgen(){
    override fun alan_hesapla() {
        println("Dikdortgen hesaplanırken Dikdortgen Sınıfında alan hesapla Override edildi.")
        super.alan_hesapla()
    }
}

class Kare : Dortgen() {
    override fun alan_hesapla() : Unit{
        println("Kare hesaplanırken Kare Sınıfında alan hesapla Override edildi.")
        super.alan_hesapla()
    }
}

fun main() {
    var karem : Kare = Kare()
    karem.boy = 5
    karem.en = 5
    karem.alan_hesapla()
    var dikdortgen = Dikdortgen()
    dikdortgen.en = 6
    dikdortgen.boy = 8
    dikdortgen.alan_hesapla()
}