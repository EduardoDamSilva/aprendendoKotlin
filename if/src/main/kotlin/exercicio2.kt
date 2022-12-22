/*
    6 - Escreva um programa para ser usado na de portaria de um evento.
    a. Peça a idade. Menores de idade não são permitidos. Mensagem: “Negado. Menores de idade não são
    permitidos.”.
    b. Peça o tipo do convite. Os tipos do convite comum, premium e luxo. Negar a entrada caso não seja nenhum
    destes. Mensagem: “Negado. Convite inválido.”.
    c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites comuns começam com “XT”.
    Caso o código não esteja nos padrões, negar a entrada. Mensagem: “Negado. Convite inválido.”.
    d. Caso todos os critérios sejam satisfeitos, exibir “Welcome :)”.
*/

fun main() {
    print("Insira sua idade: ")
    val idade = readLine()?.toInt() ?: 0

    if (idade < 18){
        return println("Negado. Menores de idade não são permitidos.")
    }

    print("Insira o tipo de convite (comum, premium ou luxo)")
    val convite = readLine()

    if (convite != "comum" || convite != "premium" || convite != "luxo"){
        return println("Negado. Convite inválido.")
    }

    print("Insira o código do convite: ")
    val codigoConvite = readLine()

    if (codigoConvite != null && codigoConvite != ""){
        if (convite == "premium" || convite == "luxo" && codigoConvite.startsWith("XL")){
            return println("Welcome :)")
        } else if (convite == "comum" && codigoConvite.startsWith("XT")){
            return println("Welcome :)")
        } else {
            return println("Negado. Convite inválido.")
        }
    } else {
        return println("Negado. Convite inválido.")
    }
}
