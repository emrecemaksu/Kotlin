fun main() {
    var dizim = arrayOf(1,2,3)
    var dizim_2 = arrayOf("emre", "ahmet", "mehmet")
    var all = AllType(dizim)
    all.yaz()
    var all2 = AllType(dizim_2)
    all2.yaz()
    Generic_Method(dizim)
    Generic_Method(dizim_2)
}

class AllType<Benim>(var dizi : Array<Benim>){
    fun yaz(): Unit {
        dizi.forEach { it -> println(it) }
    }
}

fun <Genel>Generic_Method(listem : Array<Genel>): Unit {
    listem.forEach { it -> println(it) }
}