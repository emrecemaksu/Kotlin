import org.w3c.dom.ranges.Range

fun main() {
    var range1 = 1..20
    var range2 = 20..1

    var range3 = 'a'..'z'
    var range4 = 'z'..'a'

    var range5 : IntRange = 1.rangeTo(10)
    var range6 = 20.downTo(1)

    var range7 = 1.rangeTo(20).step(2)

    var varmi = 10 in range7

    println(varmi)
    println(range7.isEmpty())
    println(range7)
}