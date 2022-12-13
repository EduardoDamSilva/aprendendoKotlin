fun main() {

    // Unsigned - numeros sem sinais ou seja absolutos que no caso não existem negativos e nem numero quebrado

    println("ULong MAX - ${ULong.MAX_VALUE} - ${ULong.MIN_VALUE}")
    println("UInt MAX - ${UInt.MAX_VALUE} - ${UInt.MIN_VALUE}")
    println("UShort MAX - ${UShort.MAX_VALUE} - ${UShort.MIN_VALUE}")
    println("UByte MAX - ${UByte.MAX_VALUE} - ${UByte.MIN_VALUE}")

    // Declararação dos número Unsigned devem ser acompanhados pelo u no final mostrando que são unsigned
    var int: UInt = 10u
    var short: UShort = 10u
    var byte: UByte = 10u
    var long: ULong = 10u


}