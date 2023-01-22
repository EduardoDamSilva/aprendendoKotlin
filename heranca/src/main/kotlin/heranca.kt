// É necessário colocar esse open para o código saber que outras classes podem usa-lá de herança
open class Eletronico(var marca: String){
    fun ligar(){}
    fun desligar(){}
}

class Computador(marca: String): Eletronico(marca) {
    fun instalarSoftware() {}
    fun processar() {}
}

fun main() {
    var c: Computador = Computador("Dell")
    // Existem os métodos da classe eletronico sem estar na classe computador
    c.ligar()
    c.desligar()
    c.marca
}