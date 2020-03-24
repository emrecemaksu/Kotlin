fun main() {
    var teoman  = object : Muzik{
        override fun pop() {
            println("Ben pop şarkıcısı mıyım?")
        }

    }
    teoman.pop()
    var yagli = object : Resim() {
        override fun yagli_Boya() {
            super.yagli_Boya()
        }
    }
    yagli.yagli_Boya()
}

interface Muzik{
    fun pop()
}

open class Resim{
    open fun yagli_Boya(): Unit {
        println("Yağlı boya")
    }
}