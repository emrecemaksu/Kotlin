fun main() {
    var hayvan_1 : Amip = Amip("Amip_Fistigi")
    hayvan_1.adim_Ne()
    var hayvan_2 : Hayvan = Balina()
    hayvan_2.hucre()
}

interface Hayvan {
    fun hucre()
    }

abstract class Memeli : Hayvan{
    override fun hucre() {
        println("Ben çok hücreliyim.")
    }
    abstract fun ses_Cikar()
}

abstract class TekHucre : Hayvan{
    override fun hucre() {
        println("Ben tek hücreliyim.")
    }
    abstract fun adim_Ne()
}

class Balina() : Memeli(){
    override fun ses_Cikar() {
        println("Vuuuuuuuuu")
    }

}

class Amip(var isim : String) : TekHucre(){
    override fun adim_Ne() {
        println("Benim adım $isim")
    }
}