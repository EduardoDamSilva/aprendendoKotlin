fun main() {

    for (i in 1..10) {
        print("$i ")
    }

    println()

    val str = "Kotlin é show!"
    for (char in str){
        print(char)
    }

    println()

    // For decrescente
    for (i in 20 downTo 10) print("$i ")

    println()

    //For de 2 em 2
    for (i in 1..10 step 2){
        print("$i ")
    }
}