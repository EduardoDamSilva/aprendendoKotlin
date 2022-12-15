fun main() {
    helloWorld()
    println("A soma de 10 e 5 é ${sum(10, 5)}")
    println(divi(10f, 3f))
}

fun sum(a: Int, b:Int): Int {
    return a + b
}

// Funcão em uma única linha
fun sum2(a: Int, b: Int) = a + b

fun divi(a: Float, b: Float) = a / b

fun helloWorld(){
    println("Hello, World!")
}
