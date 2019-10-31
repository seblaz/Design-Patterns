package fiuba.algo3.factory.sol2;

public class TableroOscuro extends Tablero {
    TableroOscuro(int cSoldados, int cJinetes, int cCuranderos, int cCatapultas) {
        super(cSoldados, cJinetes, cCuranderos, cCatapultas);
    }

    @Override
    public Catapulta crearCatapulta() {
        return new CatapultaOscura();
    }

    @Override
    public Curandero crearCurandero() {
        return new CuranderoOscuro();
    }

    @Override
    public Jinete crearJinete() {
        return new JineteOscuro();
    }

    @Override
    public Soldado crearSoldado() {
        return new SoldadoOscuro();
    }
}
