class Preguica(nome: String, idade: Int, habitat: String) : Animal(nome, idade, habitat) {
    override fun correr() {
        println("A preguiça não corre")
    }
    fun dormir(){
        println("A preguiça está dormindo")
    }

    override fun emitirSom() {
        println("Auuurh")
    }

    override fun exibirDados() {
        println("O nome é: $nome\n" +
                "A idade é: $idade\n" +
                "O habit é: $habitat")
        correr()
        dormir()
        fazSom()
        emitirSom()
    }


}