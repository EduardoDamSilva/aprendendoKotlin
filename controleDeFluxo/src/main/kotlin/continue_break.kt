fun main () {


    var i = 0
    while (i < 100000){

        if (i == 50){
            break // Para o while, sai da execução do while
            i++
        }

        print("$i ")
        i++
    }

    while (i < 80){

        if (i < 50){
            i++
            continue // Ignora o código que está embaixo do continue e volta lá para o topo do while
        }

        print("$i ")
        i++
    }
}