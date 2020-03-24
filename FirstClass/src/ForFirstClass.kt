class ForFirstClass {
    var sayi : Int = 5
    fun yazdir() = println("Tek satır fun")
    fun sayi_dondur() = sayi - 2
}

fun main(args: Array<String>) {
    var nesne : ForFirstClass = ForFirstClass()
    println(nesne.sayi)
    nesne.yazdir()
    var donen = nesne.sayi_dondur()
    println(donen)
}