fun main(args: Array<String>) {
    print("Notu gir (1 ile 100 arasında) => ")
    var not : Int? = readLine()?.toInt()
    var not_5 : Any = when(not){
        in 1..50 -> 1
        in 51..60 -> 2
        in 61..70 -> 3
        in 71..80 -> 4
        in 81..100 -> 5
        else -> "Olmadı bee..."
    }
    println("Notunuz 5'li sistem üzerinden => $not_5")
}