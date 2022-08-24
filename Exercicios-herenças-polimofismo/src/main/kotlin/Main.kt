fun main() {

        var cachoro = Cachoro("Hanna", 10, "Doméstico")
        var cavalo = Cavalo("Pé de pano",5,"Rural")
        var preguica = Preguica("Jemeremias",5,"Selva")

        println("1-Cachorro")
        println("2-Cavalo")
        println("3-Preguiça")
        print("Escolha uma das opções!: ")
        when(readln().toInt()){
          1->cachoro.exibirDados()
          2->cavalo.exibirDados()
          3->preguica.exibirDados()
          else-> println("Opção ínvalida")
        }
}