import org.junit.jupiter.api.*

class MainTest {

    @Test
    @DisplayName("Teste metodo xxoo")
    fun testCountXO () {
        // Verificando se retorna um valor true, porem se o falhar para a execução dos que estão embaixo
//        Assertions.assertTrue(countXO("xxoo"))
//        Assertions.assertTrue(countXO("xxo"))
//        Assertions.assertTrue(countXO("xx"))

        // Usando o .assertAll ele roda todos os testes independente se um deu erro, ele não para a execução dos restantes
        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertTrue(countXO("xxoO"))},
            {Assertions.assertTrue(countXO("xoo"))}
        )
    }

    @Test
    @Disabled //Quando é executado os códigos essa função não irá ser executado por causa do @Disable
    fun naoImplementado() {

    }

    @Test
    fun vaiFalhar() {
        // Função criada para falhar nos testes
    }

    @Test
    fun assumption() {
        Assumptions.assumeTrue(countXO("xxoo"))
    // Essa linha de código abaixo só irá rodar se a primeira retorna true, se comportando como se fosse um if e el
        Assertions.assertTrue(abc())
    }

    @Test
    fun exception() {
        assertThrows<NullPointerException> { abc() }
    }

}