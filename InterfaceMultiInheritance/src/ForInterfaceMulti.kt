fun main() {
    var penguen : Penguen = Penguen()
    penguen.ucar_Misin()
    penguen.yurur_Misin()
}

interface Ucan_Hayvan{
    fun ucar_Misin()
}

interface Yuruyen_Hayvan{
    fun yurur_Misin()
}

class Penguen : Ucan_Hayvan, Yuruyen_Hayvan{
    override fun ucar_Misin() {
        println("Ben uçabiliyorum.")
    }

    override fun yurur_Misin() {
        println("Ben yürüyebiliyorum.")
    }

}