package fiuba.algo3.factory.sol2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableroOscuroTest {

    @Test
    void creoTableroConCantidadDeUnidadesCorrectas() {
        Tablero tablero = new TableroOscuro(5, 2, 2, 4);
        assertEquals(tablero.cantidadDeUnidades(), 13);
    }
}