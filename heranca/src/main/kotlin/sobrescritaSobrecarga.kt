open class Eletronico2(var marca: String){
    private fun corrente (ativo: Boolean){}

    fun ligar(){
        corrente(true)
    }

    open fun desligar(){
        corrente(false)
    }
}

class Computador2(marca: String) : Eletronico2(marca){
//    Para sobrescrever uma função, a função que está sendo sobreescrita precisa ser open
    override fun desligar (){
        save()
    // O super é usado para se referenciar o metodo desligar da classe Eletronico2 que seria a classe pai e não para referenciar ela mesma fazendo um loop infinito
        super.desligar()
    }

    // Overload
    fun save() {}
    fun save(a: Int){}
    fun save(a: Float){}
    fun save(a: Double){}
}

fun main() {
    val c : Computador2 = Computador2("Dell")

    c.ligar()
    c.desligar()
}
