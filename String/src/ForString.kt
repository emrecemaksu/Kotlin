fun main(args: Array<String>) {
    var takim : String = "Fenerbahçe"
    println(takim.length)
    println(takim.replace('a', 'e'))
    println(takim.subSequence(0, 5))
    println(takim.substring(0,5))
    println(takim.substring(0..5))
    println(takim.toLowerCase())
}