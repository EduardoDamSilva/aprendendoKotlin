fun main() {
    trafficLight()
    numberPrime()
    numberPrime2()

}

fun trafficLight(){
    val trafficLightColor = "Amber"

    when (trafficLightColor) {
        "Red" -> println("Stop!")
        "Yellow", "Amber" -> println("Warning!")
        "Green" -> println("Go!")
        else -> println("Invalid traffic-light color")
    }
}

fun numberPrime() {
    val x = 3

    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
//        3 -> println("x is a prime number between 1 and 10.")
//        5 -> println("x is a prime number between 1 and 10.")
//        7 -> println("x is a prime number between 1 and 10.")
        else -> println("x isn't a prime number between 1 and 10.")
    }
}

fun numberPrime2() {
    // Any pode ser qualquer valor dentro da variavel
    val x: Any = 11

    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        is Int -> println("x is an integer number, but not between 1 and 10.")
        else -> println("x isn't a prime number between 1 and 10.")
    }
}


