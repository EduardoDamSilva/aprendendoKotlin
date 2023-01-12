/*
    Existe um erro muito comum no Java que é o NullPointerException que acontece quando é acessado uma váriavel no qual o valor é nulo pensado nisso o Kotlin tem maneiras para evitar esse erro:
* */
fun main() {
    // Está tipagem 'String?' o '?' demonstra que a váriavel pode ser nula e sem o '?' daria erro, pois ela em teoria não poderia guardar o valor 'null'
    var s: String? = null

    //1 - Erro de compilação, pois ela pode ser nula e não existe .length de váriavel nula
    println(s.length)

    //2 - Com o '?' não dará erro na compilação e retornará o valor null, fazendo com que evite problemas e rode o código por completo
    println(s?.length)

    // 3 - O operador '!!' faz com que o Kotlin rode o código mesmo que haja erros deixando os programadores tratar o erro, deixando eles assumirem o erro.
    // Normalmente se usa esse operador quando tem certeza que váriavel não é nula
    println(s!!.length)
}