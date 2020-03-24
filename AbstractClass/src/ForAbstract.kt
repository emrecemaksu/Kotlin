fun main() {
    //var hayvan = Hayvan() we dont use
    var yunuz = Yunus("Yunus")
    yunuz.ad_Soyle()
}

abstract open class Hayvan{
    open fun ad_Soyle(){
        println(isim)
    }
    abstract var isim : String
}

public class Yunus(override var isim: String) : Hayvan() {
    override fun ad_Soyle() {
        println("Benim adım $isim")
    }
}