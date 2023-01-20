fun main() {

    // objeto(f1) -> endereco de memória1
    // objeto(f2) -> endereco de memória2

    val f1: Forma = Forma(10, 8)
    val f2: Forma = Forma(10, 8)
    // Essas são as 3 funcionalidades que já vem dentro de uma classe
    //f1.equals(f2) Essa função por padrão não está comparando seus valores e sim seus endereços de memória
    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())
    println("-------------------")
    println(f2.toString())
    println(f2.hashCode())

    // Sem sobrescrever nada agora, apenas mudando de class para data class
    // Já troca o equals para comparar valores e não enderecos de memória
    // O toString() já mostra os valores da class
    // E os hashcodes são iguais, pois são gerados baseados nos valores dos atributos(variáveis)

    val f1Data: FormaData = FormaData(10 , 8)
    var f2Data: FormaData = FormaData(10, 8)
    println(f1Data.equals(f2))
    println(f1Data.toString())
    println(f1Data.hashCode())
    println("-------------------")
    println(f2Data.toString())
    println(f2Data.hashCode())

    // Além disso, o data class tem o metodo copy que passa os valores de f1 para f2
    f2Data = f1Data.copy()
}

class Forma(val a: Int, val b: Int){
    // Sobrescrevendo a função para comparar os valores e não os endereços de memória
    override fun equals(other: Any?): Boolean {
        return if (other is Forma){
            (other.a == this.a && other.b == this.b)
        } else {
            false
        }
    }
}

// O data class já faz todas as coisas que fizemos lá em cima por padrão, não precisando sobrescrever nenhuma funcionalidade.
data class FormaData(val a: Int, val b: Int)