fun main (){
//    while1()
//    while2()
//    while3("Meu nome é Eduardo")
    while4("xxxooo")
}

//1 - Considere uma caixa de água de 2 mil litros. Rômulo gostaria de encher a caixa d'água com balões de água de 7 litros. Quantos balões cabem na caixa d'água sem que o volume seja excedido?

fun while1(){
    val capacidadeMax = 2000
    val galaoDeAgua = 7

    var i = 1
    while((galaoDeAgua * i) + galaoDeAgua < capacidadeMax){
        i++
    }

    println("Cabem $i galões na caixa d'água")
}

//2 - FizzBuzz. Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo:
//  a. Quando um número for divisível por 3, imprima Buzz.
//  b. Quando um número for divisível por 5, imprima Fizz.
//  c. Quando um número for divisível por 3 e 5, imprima FizzBuzz.

fun while2(){

    var i = 1
    while(i <= 50){
        if (i % 3 == 0 && i % 5 == 0){
            print("FizzBuzz ")
        } else if (i % 3 == 0){
            print("Buzz ")
        } else if (i % 5 == 0){
            print("Fizz ")
        } else {
            print("$i ")
        }
        i++
    }
}

//3 - Escreva um programa capaz de receber um texto e imprimo-lo invertido.
//    Entrada: Meu nome é Julius.   Saída:  suiluJ é emon ueM

fun while3(texto : String) {

    var i = 0
    while(i <= texto.length){
        if (i < texto.length){
            print(texto[(texto.length - 1) - i])
        }
        i++
    }
}

//4 - Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres 'x' e 'o' e retorna true ou false. Caso não exista nem 'x' nem 'o', retorna false.
// 'xxooox' -> true    'xxxxo' -> false    'bdefghjij' -> false    'ooooxzzzzz' -> false
fun while4(texto: String): Boolean{

    var i = 0
    var qtdX = 0
    var qtdO = 0
    while(i <= texto.length){

        if (texto.contains("x")){
            qtdX += 1
        }

        if (texto.contains("o")){
            qtdO += 1
        }

        if(qtdO == qtdX || qtdO != 0 || qtdX != 0){
            return true
        }
    }
    return false
}

