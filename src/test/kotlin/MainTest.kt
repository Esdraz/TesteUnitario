import org.junit.jupiter.api.*

/*
* assertTrue
* assertFalse
* assertAll
* assertIquals
* annotations @
* -Desabilitar teste
* -Falhar teste caso a implementacao nao esteja feita
* */

class MainTest {

    @Test
    @DisplayName("Teste metodo xxoo")
    fun testCountXO() {
        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxooxo"))},
            {Assertions.assertTrue(countXO("xxxooo"))},
        )
    }

    @Test
    @Disabled
    fun naoImplementado() {

    }

    @Test
    fun vaiFalhar() {
        fail("Não posso terminar os testes sem esse metodo")
    }

    @Test
    fun assumption() {
        Assumptions.assumeTrue(countXO("xxooo"))
        Assertions.assertTrue(abc())
    }

    @Test
    fun expection() {
        assertThrows<NullPointerException> {def()}
    }
}