//  A ‘interface’ aparentemente é quase a mesma coisa que uma classe abstrata porem não se pode inicializar valores dentro dela
interface Selvagem{
    fun atacar(){}


    // Erro, pois uma inface não pode inicializar valor
    //val valor = ""
}


class Gato(nome: String): Mamifero(nome), Selvagem{
    // Precisa sobrescrever para não dar erro
    override fun atacar() {

    }

    override fun falar() {
    }
}

fun main() {

    // Uma ‘interface’ não pode ser instanciada
    //val s = Selvagem()
}