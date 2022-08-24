abstract class Animal
    (var nome: String,
     val idade: Int,
     var habitat: String ){

    abstract fun correr()

    abstract fun exibirDados()

    abstract fun emitirSom()

    open fun fazSom() {
        println("Esse animal faz som: ")
    }
}