package fiuba.algo3.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicacionTest {

    @Test
    void multiplicarOperandosFuncionaCorrectamente() {
        Operando op1 = new Operando(5);
        Operando op2 = new Operando(7);
        Operador multiplicar = new Multiplicacion();
        multiplicar.agregar(op1);
        multiplicar.agregar(op2);
        assertEquals(multiplicar.getResultado(), 35);
    }
}