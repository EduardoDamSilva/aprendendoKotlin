fun main() {
    val str = "Programacao Kotlin"

    println("Tamanho da string: ${str.length}")
    println("Posição (index) 0 da string: ${str[0]}")
    println("Começa com 'Pro'? ${str.startsWith("Pro")}")
    println("Termina com abc? ${str.endsWith("abc")}")

    println(str.substring(2, 4)) //Pega uma pequena parte da ‘string’ pela posição passada de ínicio e fim
    println(str.replace("Kotlin", "Kotlin é show!")) // Troca de lugas a strings
    println(str.lowercase())
    println(str.uppercase())

    println("            meu nome é         ".trim()) // Tira os espaços em branco denecessários como o começo e o fim

}