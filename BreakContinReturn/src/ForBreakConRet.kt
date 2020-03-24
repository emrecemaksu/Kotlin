fun main(args: Array<String>) {
    for(i in 1..20){
        if (i == 5) {
            break
        }
        println(i)
    }
    for (j in 1..10){
        if (j == 4) {
            continue
        }
        println(j)
    }
    for (k in 1..20){
        if (k == 3) {
            println("Return threw us out.")
            return
        }
        println(k)
    }
}