fun main(args: Array<String>) {
    print("Notunuzu Giriniz => ")
    var sayi : Int? = readLine()?.toInt()
    var not : Any = if (sayi in 1..20){
        println("Notun => 1")
        1
    }
    else if (sayi in 21..50){
        println("Notun => 2")
        2
    }
    else if (sayi in 51..60) {
        println("Notun => 3")
        3
    }
    else if (sayi in 61..80) {
        println("Notun => 4")
        4
    }
    else if (sayi in 81..100) {
        println("Notun => 5")
        5
    }
    else{
        println("Geçersiz giriş...")
        "Not Geçersiz"
    }
    println("Not => " + not)
}