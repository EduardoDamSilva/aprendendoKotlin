fun main() {

//  String? é uma variável que pode ter um valor de string ou não sendo null
    var favoriteActor: String? = "Eduardo"

    favoriteActor = null
    println(favoriteActor)

    var favoriteActor2: String? = "Sandra Oh"
    //println(favoriteActor2.length) // Erro, pois como a várivel pode ser nula dá um erro de compilação pois não existe .length de uma váriavel nula então temos que colocar: ?. para que acesse a propriedade length
    println(favoriteActor2?.length)

    //O operador !! também faz funcionar só que quando o valor da variavel for null dará erro.
    println(favoriteActor2!!.length)

    // Podemos usar também um if/esle para verificar se a váriavel tem o não valor

    if (favoriteActor2 != null){
        println(favoriteActor2.length)
    }

    // Ou atribuir diretamente a uma váriavel

    val lengthOfName = if (favoriteActor2 != null){
        favoriteActor2.length
    } else {
        0
    }

    // Operador Elvis ?: faz a mesma coisa que o if porem de uma forma muita mais simples de se ver
    val lengthOfNameWithElvis = favoriteActor2?.length :? 0
}