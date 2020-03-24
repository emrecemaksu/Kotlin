fun main(args: Array<String>) {
    var isim : String = "emre"
    when (isim){
        "nisa" -> print(isim)
        "emre" -> print(isim)
        "zafer" -> print(isim)
    }
    var ad : String = when(isim){
        "emre" -> "emre"
        else -> "isim tanınamadı..."
    }
    print(ad)
}