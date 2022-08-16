import java.util.*

fun main (){

     val limite: Double = 58.0
     val multa: Double = 4.0
     var sub: Double
     var valor: Double
     var leitor = Scanner (System.`in`)

    print("Digite o peso total dos tomates:" )
     var peso:Int = leitor.nextInt()

    if (peso > 50){
        sub = (peso-limite)
        valor = (multa*sub)
        println("Você passou do peso estabelecido em:  $sub" + "kg")
        println("Total da multa: R$$sub")
    }else{
        print("Você está abaixo do peso estabelecido pelo governo, não é necessário pagar multa")


    }








}
