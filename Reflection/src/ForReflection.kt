fun main() {
    var sayilar = arrayListOf<Int>(1,2,3)
    var ornek : Ornek = Ornek()
    println(::x.get())
    println(::x.name)
    println(ornek::class)
    println(sayilar.filter { isOdd(it) })
    println(sayilar.filter(::isOdd))
}

fun isOdd(x : Int) = x % 2 != 0
val x : Int = 0

class Ornek