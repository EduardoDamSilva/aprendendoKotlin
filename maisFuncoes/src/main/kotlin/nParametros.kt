fun main() {
    print(media(1f, 2f, 3f, 5.76f, 8f))
}
//O vararg possibilita que a função receba N parametros
fun media(vararg notas: Float): Float {
    var soma = 0f
    for (n in notas){
        soma += n
    }
    return (soma / notas.size)
}