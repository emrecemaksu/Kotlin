/*
class Pair<K, V>(val first: K, val second: V) {  // 1
    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }
}
fun main() {
    val (num, name) = Pair(1, "one")             // 2

    println("num = $num, name = $name")
}
*/


fun main() {
    val (min, max) = findMinMax(listOf(100, 90, 50, 98, 76, 83))    // 3
    println(" " + max + " " + min)
    val map = mapOf("Alice" to 21, "Bob" to 25)
    //map için çok faydalı
    for ((name, age) in map) {                                      // 2
        println("$name is $age years old")
    }
}

class findMinMax(listOf: List<Int>) {
    var listem = listOf
    operator fun component1(): Int? {
        return listem.min()
    }

    operator fun component2(): Int? {
        return listem.max()
    }
}