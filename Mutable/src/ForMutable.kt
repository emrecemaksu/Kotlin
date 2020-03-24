fun main() {
    //değiştirilebilen listeler için
    var degisen = arrayListOf<Any>("emre", 2, true)
    var degisen_2 = mutableListOf<Any>("aksu", "melek", "zurna", 5)
    var degisen_3 = ArrayList<Any>(5)
    var tekrarsiz_degisen = mutableSetOf<Any>("emre", "emre", 2, 2)
    var degisen_map = hashMapOf(1 to "emre", 2 to "zürafa", 3 to "dinazor")
    degisen.add("yusuf")
    degisen.set(0, "zafer")
    degisen.remove(true)
    degisen_3.add("emre")
    degisen_map.put(4, "aslan")
    degisen_map.replace(2, "ayi")
    tekrarsiz_degisen.add(3)
    degisen.forEach { println(it) }
    degisen_2.forEach{it -> println(it)}
    degisen_3.forEach { println(it) }
    println("*************")
    tekrarsiz_degisen.forEach { println(it) }
    degisen_map.forEach { println(it) }
}