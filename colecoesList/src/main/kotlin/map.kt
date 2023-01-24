fun main(){
    // Chave -> valor

    val map1 = mapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"))
    val map2 = mutableMapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"))

    println(map1)

    println(map1.entries)
    println(map1.values)

    map2["Brasil"] = "Brasília"

    map2.remove("Brasil")
    map2.contains("Brasil")
    map2.clear()
}