fun main() {
    //Java kotlin çoklu kalıtımı desteklemez.
    var ev : Ev = Ev()
    ev.banyo.dolu_Mu = true
    ev.salon.oturan_Var = true
    ev.mutfak.yemek_var = true
}

class Ev(){
    var salon : Salon = Salon()
    var mutfak : Mutfak = Mutfak()
    var banyo : Banyo = Banyo()
}

class Salon(){
    var oturan_Var : Boolean = false
}

class Mutfak(){
    var yemek_var : Boolean = false
}

class Banyo(){
    var dolu_Mu : Boolean = false
}