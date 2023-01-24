fun main() {
    val data = geraDados()
    println(data)


    // any & count
    // O any retorna true caso tenha algo na coleção e false caso contrário
    data.any()

    println("Tenho ${data.count()} elementos.")


    // first & last
    println("Primeira receita: ${data.first().nome}")
    println("Ultima receita: ${data.last().nome}")

    //sum & sumOf
    // O sum funciona para somar numeros como: Int, Double e Float
    listOf<Int>(1, 2, 3, 4).sum()

    // O sumOf funciona para somar alguma propriedade em específico
    // Nesse caso esse somaria todas as calorias das receitas, e o it é para se referir a própria lista
    data.sumOf { it.calorias }

    // filter
    // Irá filtrar e verificar se existe uma receita com o nome "Lasanha" e irá retornar ela mesma
    println(data.filter {it.nome == "Lasanha"})


    // take e takelast
    // take serve para pegar os primeiros elementos da lista
    data.take(2) // Irá retornar as 2 primeiras
    // takelast serve para pegar os ultimos elementos da lista
    data.takeLast(3) // Irá retornar as 3 ultimas

    // forEach
    data.forEach { println(it.nome) }

    // max e min
    data.maxOf {it.calorias} // Retorna o numero das calorias
    data.minOf {it.calorias}

    data.maxByOrNull { it.calorias } // Retorna o documento

    // map
    data.map { it.nome } // Ele retornará uma nova lista

    // average
    listOf(1, 2).average()
    data.map { it.calorias }.average()

    //distinct, sorted & reversed
    val lst = listOf( 1, 2, 3, 4, 5, 6, 7, 8, 1, 1, 2, 23, 1)

    println(lst.distinct()) // retorna os valores únicos/não duplicados
    println(lst.sorted())// ordena a lista
    println(lst.sortedDescending()) // ordena em ordem descrescente
    println(lst.reversed()) // inverte a lista

}

fun geraDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente(val nome: String, val quantidade: Int)