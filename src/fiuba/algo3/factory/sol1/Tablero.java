package fiuba.algo3.factory.sol1;

import java.util.ArrayList;

public class Tablero {

    private ArrayList<Soldado> soldados = new ArrayList<>();
    private ArrayList<Jinete> jinetes = new ArrayList<>();
    private ArrayList<Curandero> curanderos = new ArrayList<>();
    private ArrayList<Catapulta> catapultas = new ArrayList<>();

    public Tablero(int cSoldados, int cJinetes, int cCuranderos, int cCatapultas) {

        for(int i = 0; i < cSoldados; i++)
            soldados.add(new Soldado());

        for(int i = 0; i < cJinetes; i++)
            jinetes.add(new Jinete());

        for(int i = 0; i < cCuranderos; i++)
            curanderos.add(new Curandero());

        for(int i = 0; i < cCatapultas; i++)
            catapultas.add(new Catapulta());
    }

    public int cantidadDeUnidades(){
        return soldados.size() + jinetes.size() + curanderos.size() + catapultas.size();
    }
}
