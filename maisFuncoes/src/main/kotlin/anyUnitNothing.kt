fun main () {
    valores(false)
}

//Any: recebe qualquer tipo de valor igual um parametro generico
//Unit: tipo de função que não tem retorno
fun valores(value: Any): Unit{

}

//Nothing: retorna apenas exeções
fun valores2(value: Any): Nothing{
    TODO("Não tive tempo")// Essa função é usada para organização do código, como saber se algo está incompleto/não implementado
}