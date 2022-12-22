fun bonus(cargo: String, experienciaAnos: Int) : Int{

    return if (cargo == "Gerente"){
        if (experienciaAnos < 2) 2000 else 3000
    } else if (cargo == "Coordenador") {
        if (experienciaAnos < 1) 1500 else 1800
    } else if (cargo == "Engenheiro") {
        1000
    } else if (cargo == "Estágiario"){
        500
    } else {
        0
    }

}

fun main (){
    println(bonus("Gerente", 2))
}

