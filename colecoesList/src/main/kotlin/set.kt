fun main() {

    // A diferença do set para a list é que ele não é ordenado e não aceita valores duplicados, você pode até adicionar no set porem ele só aparecerá uma vez
    val set1: Set<String> = setOf<String>("Paris", "Berlim", "Madrid", "Madrid") // Madrid só aparecerá 1 vez
    val set2: MutableSet<String> = mutableSetOf<String>()

    println(set1)

    set2.add("São Paulo")

    set2.remove("São Paulo")
    set2.contains("São Paulo")
    set2.clear()


    // Não existe removeAt pois no set não é index/ordenação
    // set2.removeAt

}