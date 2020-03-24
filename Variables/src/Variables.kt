import forstatics.main
import forstatics.pi_icin

fun main() {
    println("Hello World!")
    println(9+9)
    println("Hello World! " + (9+9))
    // Byte short int long float double
    var n_Byte : Byte = Byte.MIN_VALUE //8 Bit
    var n_Short : Short = Short.MAX_VALUE //16 Bit
    var n_Int : Int = Int.MAX_VALUE //32 bit
    var n_Long : Long = Long.MIN_VALUE //long 64 bit
    var n_Float : Float = Float.MAX_VALUE //32 bit
    var n_double : Double = Double.MAX_VALUE //64 bit
    var number : Int = 20
    println(number)
    println("Byte Min Value => " + n_Byte)
    println("Int Max Value => " + n_Int)
    println("Long Min Value =>  $n_Long ")
    print(("Float Max Value => ${n_Float} \n"))
    println("Double Max Value => ${n_double}")
    println("Short Min Value => $n_Short")
    main()
    println(pi_icin)
}