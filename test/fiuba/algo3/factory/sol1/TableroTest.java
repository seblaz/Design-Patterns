package fiuba.algo3.factory.sol1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableroTest {

    @Test
    void creoTableroConCantidadDeUnidadesCorrectas(){
        Tablero tablero = new Tablero(5, 2, 2, 4);
        assertEquals(tablero.cantidadDeUnidades(), 13);
    }
}