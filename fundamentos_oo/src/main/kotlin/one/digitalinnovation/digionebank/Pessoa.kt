package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Jether"
    var cpf:String = "123.123.123.12"
    private set

}


fun main(){
    val  Jether = Pessoa()
    Jether.cpf = "1245.1287"
    println(Jether.nome)
    println(Jether.cpf)


}