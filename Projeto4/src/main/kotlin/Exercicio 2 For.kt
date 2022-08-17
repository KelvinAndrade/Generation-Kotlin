fun main() {
    /*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

    var contPar = 0
    var contImpar = 0

    for (n in 1..10){
        println("Digite o ${n} número: ")
        var num = readln().toInt()

        if (num % 2 == 0){
          contPar++
        }else{
            contImpar++
        }
    }
        println("Quantidade de números pares: $contPar")
        println("Quantidade de números impares: $contImpar")
}