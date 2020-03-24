fun main() {
    var for_null: Nothing? = null
    println(for_null)

    var for_2_null : String? = null
    //for_2_null = "emre"
    println(for_2_null)
    println(for_2_null?.length)
    //println(for_2_null!!.length) whatever i want run

    var null_sayi : Int? = null
    println(null_sayi)
    println(null_sayi.toString().length)
}