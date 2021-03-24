package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {

    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.describe}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - $it")     //usando o it que o koltin apresenta
    }
    val pf = ClienteTipo.PF
    println(">>${pf.name} - ${pf.describe}")

    val pj = ClienteTipo.PJ
    println(">>${pj.name} - ${pj.describe}")
}
