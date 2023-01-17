fun main(){
    media(false,10f, 8f, 2, "", false)
}

// Criando uma tipagem generica para que receba qualquer tipo de valor
fun <T, J> media(abc: J, vararg notas: T): Float {
    var soma = 0f
    for (n in notas){
        // Como agora eu posso receber qualquer tipo de valor é necessário verificar se é numero para somar
        if (n is Float){
            soma += n
        }

    }
    return (soma / notas.size)
}