fun main() {
    topla(15, 30) {a:Int, b: Int -> a+b}
}

inline fun topla(Sayi2 : Int, Sayi1 : Int, action : (Int, Int) -> Int){
    var toplam : Int = action(Sayi1, Sayi2)
    println(toplam)
}