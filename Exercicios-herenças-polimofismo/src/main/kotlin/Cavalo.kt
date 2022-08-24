class Cavalo(nome: String, idade: Int, habitat: String) : Animal(nome, idade, habitat) {
    override fun correr() {
        println("O cavalo está correndo")
    }

    override fun emitirSom() {
        println("Iiirrrrí, rilinchin")
    }

    override fun exibirDados() {
        println("O nome é: $nome\n" +
                "A idade é: $idade\n" +
                "O habit é: $habitat")
                correr()
                fazSom()
        emitirSom()
    }
}
