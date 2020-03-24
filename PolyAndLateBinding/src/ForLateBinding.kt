import kotlin.random.Random

open class Hayvan{
    open fun konus(): Unit {
        println("Hayvan konuştu...")
    }
}

class Yunus : Hayvan(){
    override fun konus() {
        println("Yunus konuştu.")
    }
}

class Kedi : Hayvan() {
    override fun konus() {
        println("Kedi konustu")
    }
}

fun main() {
    var hayvan = Array<Hayvan>(3){Hayvan()}
    for (h in 0 until hayvan.size-1) hayvan[h] = konustur()
    for (hayvanimiz : Hayvan in hayvan) hayvanimiz.konus()
}

fun konustur(): Hayvan {
    var rastgele : Int = (Math.random() * 3).toInt()
    var oAnkiHayvan : Hayvan = Hayvan()
    when(rastgele){
        0 -> oAnkiHayvan = Hayvan()
        1 -> oAnkiHayvan = Yunus()
        2 -> oAnkiHayvan = Kedi()

    }
    return oAnkiHayvan
}
