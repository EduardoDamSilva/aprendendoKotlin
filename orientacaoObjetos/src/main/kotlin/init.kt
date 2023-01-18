class Animal(var especie: String) {
    // Quando instânciada a classe irá fazer tudo que está dentro do bloco init não importa quantos tenham
    var fala: String = ""
    init {
        println("init 1")
        fala = if (especie == "cachorro"){
            "Au Au"
        } else if (especie == "gato"){
            "Miau"
        } else {
            ""
        }

    }
    init{
        println("init 2")
    }

    fun falar() {
        println(fala)
    }
}

fun main (){
    val animal = Animal("cachorro")
    animal.falar()
}