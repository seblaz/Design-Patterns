package fiuba.algo3.composite;

public class Multiplicacion extends Operador {

    @Override
    public int getResultado() {
        int total = 1;
        for (Componente comp : getOperandos())
            total *= comp.getResultado();
        return total;
    }
}
