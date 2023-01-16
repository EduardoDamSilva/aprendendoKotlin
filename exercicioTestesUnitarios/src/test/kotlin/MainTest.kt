import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    @DisplayName("Testa a função portaria")
    fun testPortaria(){
        Assertions.assertAll(
            { Assertions.assertEquals(portaria(17, "comum", "xt"), "Negado.")},
            { Assertions.assertEquals(portaria(18, "", ""), "Negado.")},
            { Assertions.assertEquals(portaria(18, "comumm", ""), "Negado.")},
            { Assertions.assertEquals(portaria(18, "comum", ""), "Negado.")},
            { Assertions.assertEquals(portaria(18, "comum", "xt"), "Welcome.")},
            { Assertions.assertEquals(portaria(18, "premium", "xl"), "Welcome.")},
            { Assertions.assertEquals(portaria(18, "luxo", "xl"), "Welcome.")},
            { Assertions.assertEquals(portaria(18, "premium", "xt"), "Negado.")},
        )
    }
}