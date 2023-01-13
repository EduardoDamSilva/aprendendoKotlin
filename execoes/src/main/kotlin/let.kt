fun main (){
    val str: String? = null

    // Ao invés de precisar verificar desse jeito podemos usar o let
    if (str != null){
        str.lowercase()
        str.length
    }

    str?.let{
        // esse corpo só irá ser executado caso o str for diferente de nulo

        it.lowercase()
        it.length
    }
}