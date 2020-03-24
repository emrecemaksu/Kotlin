class User (){
    constructor(id: Int, isim: String, s: String) : this() {
        println("Consdan gelen => ID : $id, İsim : $isim")
    }
    constructor(id: Int, isim: String): this(){
        println("Diğer Consdan gelen => ID : $id , İsim : $isim")
    }

}

fun main() {
    var kullanıcı : User = User(isim = "emre", id = 21)
    var kullanıcı_2 : User = User(20, "emre", "erkek")
}