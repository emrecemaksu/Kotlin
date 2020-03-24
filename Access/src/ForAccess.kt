open class Main{
    internal var a : String = "a"
    private var b : String = "b"
    protected var c : String = "c"
    public var d : String = "d"
    open fun yaz(): Unit {
        println(a)
        println(b)
        println(c)
        println(d)
    }
}

class Alt_Sinif : Main() {
    override fun yaz() {
        println(a)
        println(c)
        println(d)
        print("\n")
        super.yaz()
    }
}

fun main() {
    var alt : Alt_Sinif = Alt_Sinif()
    alt.yaz()
    println(alt.a)
    println(alt.d)
}