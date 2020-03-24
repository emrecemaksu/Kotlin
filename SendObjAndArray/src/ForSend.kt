class Daire(yaricap : Int){
    var yari_r : Int = yaricap
}

fun main() {
    var daire_1 : Daire = Daire(5)
    var daire_2 : Daire = Daire(7)
    var array_daire = arrayListOf<Daire>()
    array_daire.add(daire_1)
    array_daire.add(daire_2)
    daire_alanı(daire_1)
    daire_alanı(daire_2)
    daire_alanı(array_daire)
}

fun daire_alanı(daire : Daire): Unit {
    println("Dairenin alanı ${Math.pow(daire.yari_r.toDouble(), 2.0)*Math.PI}")
}

fun daire_alanı(daire: ArrayList<Daire>): Unit {
    for (alan in daire) println("Dairenin alanı ${Math.pow(alan.yari_r.toDouble(), 2.0)*Math.PI}")
}