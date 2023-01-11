/* Ana e Paula são duas programadoras da empresa XDM. A empresa XDM possui um benefício para incetivar os funcionários a pouparem dinheiro para a aponsentadoria que funciona da seguinte forma:
Se o funcionário destinar 5% do seu salário para o investimento, a empresa acrescenta o mesmo valor. Ou seja, caso o funcionário invista 100 reias, a empresa investe mais 100. Este fundo de investimento possui rendimento de 0.2% ao mês.

Ana adorou a ideia e vai investir. No entanto, Paula decidiu que vai investir os mesmo 5% por conta própria já que conhece investimentos que rendem mais 0.2% ao mês. Paula vai escolher investimentos que rendem 0.8% ao mês.
Considere o salário de Ana e Paula iguais e no valor de 10 mil reias e que as duas estão começando com saldo 0 e que investirão 5% do salário.

Em quantos meses o patrimônio de Paula vai superar o pâtrimonio de Ana? */

fun main (){
    desafio()
}

fun desafio(){
    var investimentoPaula = 500.0
    var investimentoAna = 1000.0

    var patrimonioAna = 0.0
    var patrimonioPaula = 0.0
    var mes = 0
    while(patrimonioPaula <= patrimonioAna){
        patrimonioPaula = (investimentoPaula + patrimonioPaula) * 1.008
        patrimonioAna = (investimentoAna + patrimonioAna) * 1.002
        mes += 1
    }
    println("O patrimônio da Paula irá passar o da Ana em $mes meses")
}