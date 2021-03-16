package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco("DigiOne", 12)
    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "banco2")// só se for necessario alterar ou usar

    println(banco2.info())
}