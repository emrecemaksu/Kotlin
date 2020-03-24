fun main() {
    var sayi_1 = 15
    var sayi_2 = 5
    println("Sum => ($sayi_1 + $sayi_2)")
    println("Sum => " + (sayi_1 + sayi_2))
    println("Mod => ${sayi_1%sayi_2}")
    println("Sum => " + sayi_1 + sayi_2)
    sayi_1 += 5
    println(sayi_1)
    var sayi_3 = 12
    var sayi_4 = 45
    var bool : Boolean
    bool = sayi_3 == sayi_1
    println(bool)
    bool = sayi_4 != sayi_3
    println(bool)
    var con_1 = true
    var con_2 = false
    println(con_1 && con_2) //And
    println(con_1 || con_2) //Or
    println(!con_1)
    println(sayi_3)
    println(++sayi_3)
    println(sayi_3++)
    println(sayi_3)
    var sayi_5 : Int = sayi_2++
    var sayi_6 : Int = ++sayi_2
    println("Num 5 => " + sayi_5)
    println("Num_6 => " + sayi_6)
    /*
    * ()
    * sayi++
    * ^
    * * and /
    * + and -
    * == atama
    * sayi--
    * */
    //
}