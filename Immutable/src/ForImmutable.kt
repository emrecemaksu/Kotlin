fun main() {
    var listof = listOf<Any>("emre", "nisa", 1)
    var not_null_listof = listOfNotNull<String>("emre", "cem", null)
    var tekrar_etmeyen = setOf("emre", "emre", 2, "nisa", 3)
    var degismeyen_map = mapOf(1 to "emre", 2 to "recep", 3 to "gamze")
    not_null_listof.forEach { it -> println(it) }
    var sayi = listof[2] as Int
    println(sayi)
    println(not_null_listof.size)
    tekrar_etmeyen.forEach { println(it) }
    degismeyen_map.forEach{ println(it)}
}