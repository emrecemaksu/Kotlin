open class Iki_ayakli{
    open fun bagir(): String {
        return "Ben iki ayaklıyım."
    }
    init {
        println("En üst sınıf")
    }
}

class Horoz : Iki_ayakli(){
    override fun bagir(): String {
        return "Üüüürürrüüüüüüü"
    }
}

open class Tavuk : Iki_ayakli(){
    override fun bagir(): String {
        return "Gıd Gıd Gıdak gıdak"
    }

    init {
        println("Bir alt sınıf.")
    }

    fun goz_sayisi(): Unit {
        println("İki tane gözüm var.")
    }
}

class Civciv : Tavuk(){
    override fun bagir(): String {
        return "Cik Cik Cik"
    }
    init {
        println("En alt sınıf.")
    }
}

fun main() {
    var iki_ayakli : Iki_ayakli = Iki_ayakli()
    var tavuk : Tavuk = Tavuk()
    var horoz : Horoz = Horoz()
    var civciv : Civciv = Civciv()
    konustur(iki_ayakli)
    konustur(tavuk)
    konustur(horoz)
    konustur(civciv)
}

fun konustur(iki_bacakli: Iki_ayakli): Unit {
    println(iki_bacakli.bagir())
}