abstract class Mamifero(val nome: String){
    fun acordar(){}
    fun dormir(){}
// Pelo fato dos mamiferos 'falarem' porem de jeitos diferentes é colocado um metodo sem corpo, pois toda vez será necessário trocar o corpo dependendo do mamifero, fazendo com que essa classe sirva apenas de molde e por isso o nome abstract
    abstract fun falar()
}

class Cachorro(nome: String): Mamifero(nome){
    override fun falar() {

    }
}

fun main() {

}