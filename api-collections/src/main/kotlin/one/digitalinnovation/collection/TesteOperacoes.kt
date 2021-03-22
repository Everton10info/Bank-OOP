package one.digitalinnovation.collection

fun main() {
    val salarios = doubleArrayOf(1000.0,2250.0,4000.0)
    for(salario in salarios){
        println(salario)
    }
    println("------------------------")

    println("Maior salário : ${salarios.maxOrNull()} ")
    println("Menor salário: ${salarios.minOrNull()}") // refatorado min e max
    println("média salarial: ${salarios.average()}")
    println("------------------------")

    val salariosMaiorQue2500 = salarios.filter{it > 2500.0} //cria outro array
    salariosMaiorQue2500.forEach { it -> println(it) }

    println("------------------------")
    println(salarios.count { it in 2000.0 .. 5000.0 }) //conta o resultado

    println("------------------------")
    println(salarios.find { it == 2250.0})  //exibe se a expressao for satsfeita
    println(salarios.find { it == 20.0})

    println("------------------------")
    println(salarios.any { it == 1000.0})
    println(salarios.any { it == 10.0}) //responde se tem ou nao o elemento

}