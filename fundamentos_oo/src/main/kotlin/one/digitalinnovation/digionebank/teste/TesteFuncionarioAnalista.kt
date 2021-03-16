package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {

    val joao = Analista("Joao Antonio", "123456" , 5000.00)
    ImprimeRelatorioFuncionario.imprime(joao)

}
