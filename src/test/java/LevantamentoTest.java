import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LevantamentoTest {

    @Test
    void deveContarAlunosAtivosCurso() {
        Bicicletario bicicletario = new Bicicletario(
                new Bicicleta("Adulta", true),
                new Bicicleta("Adulta", true),
                new Bicicleta("Infantil", false),
                new Bicicleta("Infantil", true)
        );
        assertEquals(3, Levantamento.contarBicicletasAtivasBicicletario(bicicletario));
    }

    @Test
    void deveContarTotalBicicletasBicicletario() {
        Bicicletario bicicletario = new Bicicletario(
                new Bicicleta("Infantil", true),
                new Bicicleta("Adulta", true),
                new Bicicleta("Adulta", false),
                new Bicicleta("Infantil", true)
        );
        assertEquals(4, Levantamento.contarTotalBicicletasBicicletario(bicicletario));
    }

}