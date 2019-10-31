package fiuba.algo3.factory.sol1.refactor1;

import fiuba.algo3.factory.sol1.Catapulta;
import fiuba.algo3.factory.sol1.Curandero;
import fiuba.algo3.factory.sol1.Jinete;
import fiuba.algo3.factory.sol1.Soldado;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tablero {
    List<Class<?>> clases = Arrays.asList(Soldado.class, Jinete.class,
                                          Curandero.class, Catapulta.class);
    ArrayList<Object> unidades = new ArrayList<>();

    public Tablero(int cSoldados, int cJinetes, int cCuranderos, int cCatapultas) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
       List<Integer> cantidades = Arrays.asList(cSoldados, cJinetes,
                                                cCuranderos, cCatapultas);
       for(int i = 0; i < clases.size(); i++){
           Class<?> clase = clases.get(i);
           int cantidad = cantidades.get(i);
           for (int j = 0; j < cantidad; j++){
               unidades.add(clase.getDeclaredConstructor().newInstance());
           }
       }
    }

    public int cantidadDeUnidades(){
        return unidades.size();
    }
}
