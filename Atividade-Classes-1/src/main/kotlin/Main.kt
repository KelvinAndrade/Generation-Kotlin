/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/
package ClienteClass

fun main(){

 print("Digite seu nome: ")
 var nome = readln()

 print("Digite seu CPF: ")
 var cpf = readln()

 print("Digite seu RG: ")
 var rg = readln()

 print("Digite seu apelido: ")
 var apelido = readln()

 print("Digite seu CNPJ: ")
 var cnpj = readln().toInt()

 var cliente1 = Cliente(nome, cpf, rg, apelido, cnpj)

 println(cliente1.nome)
 println(cliente1.cpf)
 println(cliente1.cpf)
 println(cliente1.apelido)
 println(cliente1.cnpj)

 cliente1.atualizanome()

 println(cliente1.nome)
 println(cliente1.cpf)
 println(cliente1.cpf)
 println(cliente1.apelido)
 println(cliente1.cnpj)
}