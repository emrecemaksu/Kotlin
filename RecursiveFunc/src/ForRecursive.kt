import java.math.BigInteger

fun main() {
    //sayisonsuz(0)
    //Faktoriyel(5)
    //println(RecFaktoriyel(5))
    println(TailRecFaktoriyel(BigInteger("500")))
}

fun sayisonsuz(i: Int) {
    if(i == 1000){
        println("Aşıyoruz bu kadar yeter.")
    }
    else {
        println(i)
        sayisonsuz(i+1)
    }
}

fun Faktoriyel(sayi : Int){
    var sonuc = 1
    for(i in sayi.downTo(1)){
        sonuc *= i
    }
    println(sonuc)
}

fun RecFaktoriyel(sayi: Int) : Int{
    var sonuc = 1
    if (sayi.equals(0)){
        return 1
    }
    else{
        sonuc = sayi * RecFaktoriyel(sayi-1)
        return sonuc
    }
}

tailrec fun TailRecFaktoriyel(sayi: BigInteger, sonuc : BigInteger = BigInteger.ONE) : BigInteger{
    if (sayi == BigInteger.ONE){
        return sonuc
    }
    else{
        return TailRecFaktoriyel(sayi- BigInteger.ONE, sayi * sonuc)
    }
}