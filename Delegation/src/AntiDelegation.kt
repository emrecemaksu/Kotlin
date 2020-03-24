interface Liver{
    fun live()
    fun animals_plants()
}

open class Animals(): Liver{
    open override fun live() {
        println("I am living ")
    }

    override fun animals_plants() {
        println("I am ")
    }
}

open class Plants(): Liver{
    override fun live() {
        println("I am living ")
    }

    override fun animals_plants() {
        println("I am ")
    }

}

class Papatya(val isim_bitki : String): Plants(){
    override fun animals_plants() {
        super.animals_plants()
        print(isim_bitki)
    }

    override fun live() {
        super.live()
        print(isim_bitki)
    }
}
class Balik(val isim_hayvan : String) : Animals(){
    override fun animals_plants() {
        super.animals_plants()
        print(isim_hayvan)
    }

    override fun live() {
        super.live()
        print(isim_hayvan)
    }
}

fun main() {
    var bitkim = Papatya("Papatya")
    var hayvanim = Balik("Balık")
    bitkim.live()
    hayvanim.animals_plants()
}