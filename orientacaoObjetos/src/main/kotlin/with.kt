fun main(){

    val pessoaCriadaParaExecucaoDeTestes = Pessoa(1985, "Frank")
    pessoaCriadaParaExecucaoDeTestes.acordar()
    pessoaCriadaParaExecucaoDeTestes.dormir()

    // simplificando a chamada dos métodos, diminuindo o tamanho do código
    with(pessoaCriadaParaExecucaoDeTestes){
        acordar()
        dormir()
    }
}