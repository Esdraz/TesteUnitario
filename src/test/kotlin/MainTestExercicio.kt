import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTestExercicio {

    @Test
    @DisplayName("Faz os testes do cenario da portaria")
    fun testePortaria() {
        //Caso falhe um, nao executa o proximo teste
        Assertions.assertEquals(portaria(15, "", ""), "Negado.")
        Assertions.assertEquals(portaria(20, "", ""), "Negado.")
        Assertions.assertEquals(portaria(22, "VIP", ""), "Negado.")
        Assertions.assertEquals(portaria(22, "comum", "xt3425"), "Welcome.")
        Assertions.assertEquals(portaria(25, "comum", "45689"), "Negado.")
        Assertions.assertEquals(portaria(25, "premium", "xt45689"), "Negado.")
        Assertions.assertEquals(portaria(25, "premium", "45689"), "Negado.")
        Assertions.assertEquals(portaria(25, "premium", "xl45689"), "Welcome.")
        Assertions.assertEquals(portaria(25, "luxo", "xl45689"), "Welcome.")

        // Executa todos os testes independente de falha ou sucesso
        Assertions.assertAll(
            { Assertions.assertEquals(portaria(15, "", ""), "Negado.") },
            { Assertions.assertEquals(portaria(20, "", ""), "Negado.") },
            { Assertions.assertEquals(portaria(25, "VIP", ""), "Negado.") },
            { Assertions.assertEquals(portaria(25, "comum", "xt45689"), "Welcome.") },
            { Assertions.assertEquals(portaria(25, "comum", "45689"), "Negado.") },
            { Assertions.assertEquals(portaria(25, "premium", "xt45689"), "Negado.") },
            { Assertions.assertEquals(portaria(25, "premium", "45689"), "Negado.") },
            { Assertions.assertEquals(portaria(25, "premium", "xl45689"), "Welcome.") },
            { Assertions.assertEquals(portaria(25, "luxo", "xl45689"), "Welcome.") }
        )
    }
}