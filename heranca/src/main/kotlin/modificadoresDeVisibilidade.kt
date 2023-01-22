
// Essa classe private pode ser instanciada dentro desse mesmo arquivo, mas em arquivos fora não, pois ela é privada para apenas esse arquivo
private class X()



open class Automovel(var marca: String) {
    // Private X Protected
    // Apenas essa classe consegue acessar o metodo ativarCorrente graças ao private
    private fun ativarCorrente() {}
    // Apenas essa classe e as classes que herdam ela podem enxegar o método XPTO
    protected fun XPTO() {}
    fun ligar(){
        ativarCorrente()
    }
    fun desligar(){}
}

// public é redundante no Kotlin pois tudo já é público e pode ser acessado por todos.
public class Carro(marca: String) : Automovel(marca){
    fun ligarRadio(){}

}

fun main (){
    var c: Carro = Carro("Ferrari")

    c.ligar()
    c.desligar()
    c.ligarRadio()
}