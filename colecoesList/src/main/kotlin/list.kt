fun main() {

    // listOf não pode ser modificada
    val list1: List<Int> = listOf(1, 2, 3, 4, 5)
    // mutableListOf pode ser modificada
    val list2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    println(list2[0])
    println(list2.size)

    list2.add(10)
    list2.add(8)
    list2.remove(8)
    // Remove por posição
    list2.removeAt(0)

    // Verifica se contem o número
    list2.contains(1)
    // Limpa a lista
    list2.clear()

    println(list2)
}