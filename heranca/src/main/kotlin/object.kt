class Matematica {

    // Seria como o 'static' no Java
    companion object {
        val PI = 3.1415
        fun teste() {

        }
    }

    object obj1{
        val PI = 3.1415
        fun teste() {

        }
    }

    object obj2{
        val PI = 3.1415
        fun teste() {

        }
    }
}

fun main() {
//Com o companion object eu consigo acessar coisas da classe sem instacia-la pois tudo que está lá faz parte da classe e não da instancia
    Matematica.PI
    Matematica.teste()

//Já o object faz a mesma coisa que o companion object porem eu preciso chama-lo pelo seu nome, e ele pode ser criado várias vezes
    Matematica.obj1.PI
    Matematica.obj1.teste()
}