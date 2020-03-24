fun main() {
    var nesne = Dis_Sinif()
    nesne.Ic_Sinif().En_Ic_Sinif().en_ic_Sinif()
    var nesne2 = Dis_Sinif.Yan_Sinif()
    nesne2.yan_Sinif()
}

class Dis_Sinif{
    fun dis_yaz(): Unit {
        println("Ben bir dis sinifim.")
    }
    inner class Ic_Sinif{
        fun ic_yaz(): Unit {
            println("Ben bir iç sinifim.")
        }
        inner class En_Ic_Sinif{
            fun en_ic_Sinif(): Unit {
                println("Ben en iç sinifim.")
            }
        }
    }
    class Yan_Sinif{
        fun yan_Sinif(){
            println("Ben bir nested olmayan yan sınıfım.")
        }
    }
}