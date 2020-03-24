open class Insan(isim: String,open val yas: Int, erkekmi: Boolean) {
    var isim : String = isim
    open fun isim_yaz(): Unit {
        println("İnsanın ismi : $isim")
    }
}

class Oarsmen: Insan{
    constructor(isim: String, yas: Int, erkekmi: Boolean) : super(isim, yas, erkekmi)

    override fun isim_yaz() {
        println("Yaşı : $yas")
        super.isim_yaz()
    }
}

fun main() {
    var ogrtmn : Oarsmen = Oarsmen("emre", 22, true)
    ogrtmn.isim_yaz()
}