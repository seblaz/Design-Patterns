package fiuba.algo3.factory.sol1.refactor1;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class TableroTest {

    @Test
    void cantidadDeUnidades() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Tablero tablero = new Tablero(5, 2, 2, 4);
        assertEquals(tablero.cantidadDeUnidades(), 13);
    }
}