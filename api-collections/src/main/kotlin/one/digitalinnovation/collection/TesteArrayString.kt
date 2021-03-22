package one.digitalinnovation.collection

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Záira"
    nomes[2]= "José"

    for (nome in nomes){
        println(nome)
    }
    println("------------------")
    nomes.sort()
    nomes.forEach { n ->
        println(n) }
    println("------------------")

    val nomes2 = arrayOf("Maria","Pedro","Záza")

    nomes.sort()
    nomes.forEach { n ->
        println(n) }
}