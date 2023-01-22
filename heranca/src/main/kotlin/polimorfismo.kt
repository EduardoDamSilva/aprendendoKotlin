interface Funcionario {
    var salario: Float
    fun bonus(): Float
}

//Para conseguir pegar a var salario é necessário fazer um overide dentro dos parametros
class Gerente(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.5f
    }
}

class Analista(override var salario: Float): Funcionario{
    override fun bonus(): Float {
        return salario * 0.3f
    }
}

// Aqui está a ideia de polimorfismo, pois Gerente e Analista, ambos são funcionário e por tanto podem entrar como parametro para essa função sem erro algum
fun mostraBonus(func: Funcionario){
    println(func.bonus())
}



fun main() {

    val eduardo = Gerente(3000f)

    mostraBonus(eduardo)
    mostraBonus(Analista(5000f))
    mostraBonus(Gerente(3000f))
}