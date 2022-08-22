import AviaoClass.Aviao

/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/
fun main() {
    println("Digite a cor do avião: ")
    var cor = readln()

    println("Digite a companhia do avião: ")
    var companhia = readln()

    print("Digite se o avião já saiu: ")
    val verifica = readln().toBoolean()

    val aviao1 = Aviao(cor, companhia, verifica)

    print(aviao1.cor)
    println(aviao1.compahia)
    println(aviao1.aviao)

    aviao1.decolando()
}




