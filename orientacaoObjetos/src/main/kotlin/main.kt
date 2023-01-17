// os parametros precisam receber var/val para ser acessados posteriormente pela instância
class Pessoa(val anoNascimento: Int, var nome: String){

    var documento = ""

    var doc: String? = null
    // Construtor secundário: usado para colocar um parâmetro opcional que no caso seria o doc
    constructor(anoNascimento: Int, nome: String, doc: String) : this(anoNascimento, nome){
        this.doc = doc
    }

    fun dormir(){

    }

    fun acordar(){

    }
}

//private constructor: faz com que a classe não possa ser instanciada
class Vazia private constructor()

fun main() {
    //class - comportamentos e atributos

    //classe (instância/cria) objetos
    var pessoa: Pessoa = Pessoa(2001, "Eduardo", "2831u283")

    pessoa.nome // atributo
    pessoa.dormir() // metodos
}