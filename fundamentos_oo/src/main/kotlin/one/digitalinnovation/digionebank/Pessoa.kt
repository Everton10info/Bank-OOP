package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Jether"
    var cpf:String = "123.123.123.12"
    private set
    constructor()

    fun pessoainfo()= "$nome e  $cpf"

}


fun main(){
    val  Jether = Pessoa()
    println(Jether.pessoainfo())



}