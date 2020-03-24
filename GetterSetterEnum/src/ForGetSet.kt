fun main() {
    var al = al_Ver("nisa")
    println(al.erkek)
}
enum class ERKEK_isimleri{
    EMRE,
    ERDEM,
    KEMAL
}
class al_Ver(var erkek1: String) {
    var erkek : String = ""
        get() = field
        set(value) {
            if(value != ERKEK_isimleri.EMRE.toString()){
                field = "Erkek isim Emre olmalı"
            }
            else field = value
        }
    init {
        this.erkek = erkek1
    }
    /*
    constructor(erkek : String){
        this.erkek = erkek
    }
     */
}