class Write{
    var ad : String = ""
    var yas : Int = 0

    fun For_Write(): Unit {
        println("İsim => $ad, Yaş => $yas")
    }
}

fun main() {
    var write : Write = Write()
    with(write){
        ad = "Emre Cem AKSU"
        yas = 22
    }
    var write_2 : Write = Write()
    write_2.apply {
        ad = "Zafer AKSU"
        yas = 29
    }.For_Write()
    write.For_Write()
}