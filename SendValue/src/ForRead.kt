fun main() {
    print("Adınızı Giriniz => ")
    var ad : String? = readLine()
    print("\nSoyad => ")
    var soyad : String = readLine().toString() // toString() or !!
    print("\nYaş => ")
    var yas : Int? = readLine()?.toInt()

    println("İsim => ${ad!!.length} Soyad => ${soyad.length} Yaş => $yas")
}