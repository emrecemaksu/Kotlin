fun main() {
    var sayi_seri : Array<Int> = arrayOf(5,6,7,8)
    var sayi_2_seri = intArrayOf(1,12,13)
    var yazi_3_seri = arrayOf("ecem", 2)
    var yazi_4_seri : ArrayList<Any> = arrayListOf<Any>("emre", "nisa")
    println(sayi_seri.size)
    println(sayi_seri[2])
    var any_seri : Array<Any> = arrayOf("emre", 5, true)
    yazi_4_seri.addAll(yazi_3_seri)
    println(any_seri.get(2))
    println(sayi_2_seri[1].toString())
    println(yazi_3_seri)
    println(yazi_4_seri)

}