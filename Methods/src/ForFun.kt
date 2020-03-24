fun main(args: Array<String>) {
    ekranayaz()
    yas_metodu(5)
    yas_metodu("20", 20)
    yas_metodu()
    yas_metodu(1,2,3,4,5)
    var liste : Array<Int> = arrayOf(1,2,3,4,5)
    yas_metodu(liste)
}

fun yas_metodu(yas: Array<Int>) {
    for (x in yas) println(x)
}

fun ekranayaz(){
    println("Seni çok seviyorum...")
}

fun yas_metodu(yas : Int){
    println("Yaşınız => $yas")
}

fun yas_metodu(yas : String, yas_sayi : Int) : Unit{
    println("Yaşınız yazıyla => $yas")
}

fun  yas_metodu(){
    println("Parametresiz metod.")
}

fun yas_metodu(vararg sayilar : Int){
    for(x in sayilar) println("Sayılar => $x")
}