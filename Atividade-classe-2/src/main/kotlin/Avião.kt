package AviaoClass

class Aviao(
    var cor: String,
    var compahia: String,
    var aviao: Boolean,
) {

    fun decolando() {
        if (aviao){
            println("O avião está decolando")
        }else{
            println("O avião ainda não decolou")

        }
    }

}
