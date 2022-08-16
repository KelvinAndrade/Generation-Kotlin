fun main(){
    /*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
*/
    println("Digite sua idade para ver qual turma você irá: ")
    val cate = readln().toInt()

    when(cate) {

        in 10..14 -> println("Turma Infatil")
        in 15..17 -> println("Turma Juvenil")
        in 18..25 -> println("Turma Adulta")
    }










}

