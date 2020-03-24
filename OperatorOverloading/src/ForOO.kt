fun main() {
    println(5+3)
    println("5" + 3)
    println(5.plus(5))
    var b1 : Birlestir = Birlestir("Emre Cem ")
    var b2 : Birlestir = Birlestir("AKSU ")
    var b3 : Birlestir = b1.plus(b2)
    var b4 : Birlestir = b1 plus b2
    var b5 : Birlestir = b1 + b2
    println(b3.deger)
    println(b4.deger)
    println(b5.deger)
}
class Birlestir(var deger : String)

operator infix fun Birlestir.plus(birlestir: Birlestir) : Birlestir{
    var birlesmis : Birlestir = Birlestir(this.deger + birlestir.deger)
    return  birlesmis
}