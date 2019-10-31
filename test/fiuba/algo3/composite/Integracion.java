package fiuba.algo3.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Integracion {

    @Test
    void puedoMultiplicarYSumar(){
        Operando cinco = new Operando(5);
        Operando siete = new Operando(7);
        Operador multiplicar = new Multiplicacion();
        multiplicar.agregar(cinco);
        multiplicar.agregar(siete);

        Operando diez = new Operando(10);
        Operador suma = new Suma();
        suma.agregar(diez);
        suma.agregar(multiplicar);

        assertEquals(suma.getResultado(), 45);
    }

    @Test
    void puedoMultiplicarSumarYElevarAUnaPotencia(){
        Operando cinco = new Operando(5);
        Operando siete = new Operando(7);
        Operador multiplicar = new Multiplicacion();
        multiplicar.agregar(cinco);
        multiplicar.agregar(siete);

        Operando diez = new Operando(10);
        Operador suma = new Suma();
        suma.agregar(diez);
        suma.agregar(multiplicar); // (5 * 7) + 10

        Operando dos = new Operando(2);
        Operando tres = new Operando(3);

        Operador potencia = new Potencia();
        potencia.agregar(dos);
        potencia.agregar(tres); // 2 ^ 3

        Operador sumaFinal = new Suma();
        sumaFinal.agregar(suma);
        sumaFinal.agregar(potencia); // ((5 * 7) + 10) + (2 ^ 3)

        assertEquals(sumaFinal.getResultado(), ((5 * 7) + 10) + (8));
    }
}
