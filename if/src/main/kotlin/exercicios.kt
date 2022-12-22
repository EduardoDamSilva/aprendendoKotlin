/*
    1 - Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no final
    do ano. Os bônus são classificados por cargo.
    a. Gerentes recebem R$ 2.000,00
    b. Coordenadores recebem R$ 1.500,00
    c. Engenheiros de software recebem R$ 1.000,00
    d. Estagiários recebem R$ 500,00
*/

/*
    2 - Modifique o primeiro exercício para considerar o tempo de experiência no cálculo de bônus.
    a. Gerentes com menos de 2 anos de experiência recebem R$ 2.000,00, caso contrário recebem R$ 3.000,00
    b. Coordenadores com menos de 1 ano de experiência recebem R$ 1.500,00, caso contrário recebem R$ 1.800,00
    c. Engenheiros de software recebem R$ 1.000,00
    d. Estagiários recebem R$ 500,00

 */
fun bonus(cargo: String, experienciaAnos: Int) : Int{

    return if (cargo == "Gerente"){
        if (experienciaAnos < 2) 2000 else 3000
    } else if (cargo == "Coordenador") {
        if (experienciaAnos < 1) 1500 else 1800
    } else if (cargo == "Engenheiro") {
        1000
    } else if (cargo == "Estágiario"){
        500
    } else {
        0
    }

}
/*
    3 - Escreva um programa capaz de ler dois números inteiros que representam os lados de uma figura
    geométrica. Informar se formam um quadrado (lados iguais).
*/

fun verificaQuadrado(n1: Int, n2: Int): String{
    if (n1 == n2 && n1 > 0 && n2 > 0){
        return "É um quadrado"
    } else {
        return "Não é um quadrado"
    }
}

/*
    4 - Escreva um programa capaz de ler três números inteiros que representam os lados de um triângulo. Informar
    se é um triângulo equilátero (todos os lados iguais)
*/

fun verificarTriangulo(n1: Int, n2: Int, n3: Int): String{
    if ((n1 == n2 && n2 == n3)  && (n1 > 0 && n2 > 0 && n3 > 0)){
        return "É um triângulo"
    } else {
        return "Não é um triângulo"
    }
}

/*
    5 - Considere o código abaixo. Qual a saída do programa caso informado o valor 4?
*/
fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0)
            println("Primeira string")
        else println("Segunda string")
    }
    println("Terceira string")
}
// Saída:
// Segunda String
// Terceira String

fun main (){
    println(bonus("Gerente", 2))
}

