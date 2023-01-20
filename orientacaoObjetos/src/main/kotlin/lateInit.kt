class Receita {
    //O lateinit faz com que a variável seja inicizalizada depois, para não precisar dar algum valor default e nem tratar o nulo
    lateinit var instrucoes: String

    fun geraReceita(){
        instrucoes = "Lave as mãos"
    }

    fun imprimeReceira() {
        // Verificação para ver se a váriavel já foi inicializada
        if (this::instrucoes.isInitialized){
            instrucoes = "Lave as mãos"
        }
    }
}


fun main (){
    var r: Receita = Receita()
    r.imprimeReceira()

}