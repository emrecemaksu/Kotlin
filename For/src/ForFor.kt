fun main(args: Array<String>) {
    for (i in 2.rangeTo(4).step(2)) println(i)
    for (j in "emrecemaksu"){
        println(j)
    }
    for (k in arrayListOf<Int>(5,10,20,30)){
        println(k)
    }
    outfor@ for (j in 1..10){
        for (l in 1..10){
            println("$j + $l")
            break@outfor
        }
    }
}