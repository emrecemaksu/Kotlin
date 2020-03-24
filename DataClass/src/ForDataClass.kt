fun main() {
    var emre = Person("Emre", 22)
    var emre2 = Person("Emre", 22)
    println(emre.toString())
    println(emre.equals(emre2))
    var nisa = Person2("Nisa", 23)
    var nisa2 = Person2("Nisa", 23)
    println(nisa.toString())
    println(nisa.equals(nisa2))
}

data class Person(val kisi : String,val yas : Int)
class Person2(val kisi : String,val yas : Int)