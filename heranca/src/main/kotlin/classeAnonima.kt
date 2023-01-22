interface Event{
    fun onSuccess()
}

class Programa {
    fun salvar(e: Event){
        println("Abrindo conexões.")
        println("Salvando valores.")
        println("Sucesso. Conexões fechadas.")
        e.onSuccess()
    }
}

fun main() {
    val p = Programa()
    // Instanciando uma classe anonima para passar como parametro, para funcionar a função
    p.salvar(object : Event {
        override fun onSuccess() {
            println("onSuccess")
        }

    })
}