fun main() {
    var lambdaFonksiyon = {ilk: Int, ikinci: Int -> ilk + ikinci}
    var lambdaTers = {yazi : String -> yazi.reversed()}
    var aktarici = topla(2,5, {ilk:Int, ikinci:Int -> ilk+ikinci})
    var aktarici_2 = topla(5,7, lambdaFonksiyon)
    var aktarici_3 = topla(8, 10) {ilk : Int, ikinci : Int -> ilk + ikinci}
    var yaziicin = terscevir("emre", {yazi : String -> yazi.reversed()})
    var yaziicin_2 = terscevir("deneme") {it.reversed()}
    var yaziicin_3 = terscevir("denedim", lambdaTers)
}

fun topla(sayi1 : Int, sayi2 : Int, forlam:(Int, Int) -> Int){
    var toplam = forlam(sayi1, sayi2)
    println(toplam)
}

fun terscevir(yazi : String, fonk: (String) -> String) {
    var tersi = fonk(yazi)
    println(tersi)
}