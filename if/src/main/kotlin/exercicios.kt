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

fun main (){
    println(bonus("Gerente", 2))
}

