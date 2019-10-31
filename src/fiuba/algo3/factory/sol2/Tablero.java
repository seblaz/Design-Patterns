package fiuba.algo3.factory.sol2;

import java.util.ArrayList;

public abstract class Tablero {

    private ArrayList<Soldado> soldados = new ArrayList<>();
    private ArrayList<Jinete> jinetes = new ArrayList<>();
    private ArrayList<Curandero> curanderos = new ArrayList<>();
    private ArrayList<Catapulta> catapultas = new ArrayList<>();

    Tablero(int cSoldados, int cJinetes, int cCuranderos, int cCatapultas){
        for(int i = 0; i < cSoldados; i++)
            soldados.add(crearSoldado());

        for(int i = 0; i < cJinetes; i++)
            jinetes.add(crearJinete());

        for(int i = 0; i < cCuranderos; i++)
            curanderos.add(crearCurandero());

        for(int i = 0; i < cCatapultas; i++)
            catapultas.add(crearCatapulta());
    }

    public int cantidadDeUnidades(){
        return soldados.size() + jinetes.size() + curanderos.size() + catapultas.size();
    }

    public abstract Catapulta crearCatapulta();
    public abstract Curandero crearCurandero();
    public abstract Jinete crearJinete();
    public abstract Soldado crearSoldado();
}
