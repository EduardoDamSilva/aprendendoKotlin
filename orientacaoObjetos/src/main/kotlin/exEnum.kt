enum class Prioridade(val value: Int) {
    Baixa(1){
        // Sobre escrevendo o que ela irá retornar
        override fun toString(): String {
            return "Prioridade baixa: $value"
        }
            },
    Media(5),
    Alta(15)
}


fun x(p: Prioridade){

}

fun main() {
    // enum -> limita a quantidade de valores de uma váriavel, para diminuir a quantidade de cenário possíveis e validação desnecessárias
    x(Prioridade.Baixa)

    for (p in Prioridade.values()){
        println(p)
    }
}