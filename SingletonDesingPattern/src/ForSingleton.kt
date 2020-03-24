fun main() {
    var sing = ForSingleton
    sing.isim = "ziya"
    sing.isim_Yaz()
    var sing_2 = ForSingleton
    println(sing_2.isim)
    //ama en mantıklı olan direk nesneyi çağırmak
    ForSingleton.isim = "melek"
    ForSingleton.isim_Yaz()
    var sing_3 = ForSingleton
    println(sing_3.isim)
}

object ForSingleton {
    init {
        println("Bu first const çalışır çünkü bu da bir sınıf.")
    }
    var isim : String = "emre"
    fun isim_Yaz(): Unit {
        println(isim)
    }
}