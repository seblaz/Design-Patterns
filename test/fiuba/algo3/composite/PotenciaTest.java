package fiuba.algo3.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PotenciaTest {

    @Test
    void puedoCalcularLaPotenciaDeDosOperandos() {
        Operando op1 = new Operando(2);
        Operando op2 = new Operando(10);
        Operador potencia = new Potencia();

        potencia.agregar(op1);
        potencia.agregar(op2);
        assertEquals(potencia.getResultado(), 1024);
    }
}