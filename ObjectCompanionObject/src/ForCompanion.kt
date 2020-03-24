fun main() {
    //Singleton
    var nesne : ForCompanion = ForCompanion
    nesne.isim = "Melih"
    println(nesne.isim)
    var nesne2 : ForCompanion = ForCompanion
    println(nesne2.isim)

}

object ForCompanion {
    var isim : String = "Emre"
}

class CalisanSayisi{
    //Static kavramı Companion object olarak gecer.
    companion object{
        var sayi = 0
    }
    init {
        sayi++
    }
    fun kacCalisanVar(){
        println(sayi)
    }
}