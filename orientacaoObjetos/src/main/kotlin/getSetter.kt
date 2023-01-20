//A diferença do Java para o Kotlin na questão do get e setter é que o Kotlin já faz isso automaticamente, ou seja quando eu estou acessando a váriavel dentro de uma classe ela já está usando o get e quando eu reatribuo um valor já estou usando o set
class Planeta(var especie: String){
    var galaxia: String = ""
        get() {
            println("Acesso get")
            // Aqui eu não retorno a váriavel 'galaxia' como no Java, pois o kotlin fará um looping infinito já que se eu colocar 'galaxia' ele irá acessar o get
            return field
        }
}


fun main() {
    var a = Planeta("Terra")
    a.galaxia // Acessando o get
}