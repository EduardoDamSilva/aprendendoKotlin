import java.lang.Exception

fun main() {

    try{

        val s: String? = null
        println(s!!.length)

        val a = 10/0

    // Ao invés de mostrar o Erro NullPointerException, ele irá rodar o código que está dentro do catch fazendo com que fique mais fácil tratar a exceção
    } catch (e: NullPointerException){
        println("Variável Nula")
    } catch (e: ArithmeticException){
        println("Impossível dividir por zero!")
    } catch (e: Exception){
        // Todas as exceções são variadas dessa exceção genérica
        println("Exceção Genérica")
    } finally {
        // O finally sempre será executado independente de qualquer coisa e ele é Opcional
        println("Finally!")
    }
}