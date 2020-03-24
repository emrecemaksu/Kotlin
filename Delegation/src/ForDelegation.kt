fun main() {
    var bitkim = Manolya("Manolya")
    bitkim.yasıyor()
    var hayvanim = Balina("Balina")
    hayvanim.hayvan_bitki()
}

interface Canlı{
    fun yasıyor()
    fun hayvan_bitki()
}

class Hayvan(val hayvan: String) : Canlı{
    override fun yasıyor() {
        println("Ben yaşayan bir $hayvan")
    }

    override fun hayvan_bitki() {
        println("Ben bir $hayvan")
    }

}

class Bitki(val bitki : String): Canlı{
    override fun yasıyor() {
        println("Ben yaşayan bir $bitki")
    }

    override fun hayvan_bitki() {
        println("Ben bir $bitki")
    }

}

class Balina(val balina : String) : Canlı by Hayvan(balina)

class Manolya(val manolya : String): Canlı by Bitki(manolya)