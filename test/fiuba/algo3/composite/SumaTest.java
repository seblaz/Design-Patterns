package fiuba.algo3.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest {

    @Test
    void puedoSumarDosOperandos() {
        Operando op1 = new Operando(5);
        Operando op2 = new Operando(7);
        Operador suma = new Suma();
        suma.agregar(op1);
        suma.agregar(op2);
        assertEquals(suma.getResultado(), 12);
    }
}