import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    print("Digite um número qualquer: ")
    val num = readln().toInt()

    if(num % 2 == 0){
        println("O número $num é par e sua raíz quadrada é: ${sqrt(num.toDouble())}")
    }else{
        println("O número $num é impar e sua raíz quadrada é: ${num.toDouble().pow(2)}")
    }
}
