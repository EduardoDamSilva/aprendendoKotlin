fun main() {
    println(conversorAnos(2))
    println(tamanhoArray("Bom dia!"))
    println(aoCubo(3))
    println(paraKm(20f))
    println(trocarLetrasPorX("A Maria gosta de chocolate!"))
}

fun conversorAnos(anos: Int): String {
    val meses = anos * 12
    val dias = anos * 365
    val horas = anos * 8760
    val minutos = anos * 525600
    val segundos = anos * 3154e+7

    return "$anos equivalem a:\n" +
            "$meses meses\n" +
            "$dias dias\n" +
            "$horas horas\n" +
            "$minutos minutos \n" +
            "$segundos segundos"
}

fun tamanhoArray(str: String): Int = str.length

fun aoCubo(n: Int): Int = n * n * n


fun paraKm(milha: Float): Float = milha * 1.6f


fun trocarLetrasPorX(str: String): String = str.replace("a", "x", true).lowercase()


