package fiuba.algo3.composite;

public class Suma extends Operador {

    @Override
    public int getResultado() {
        int total = 0;
        for (Componente comp : getOperandos())
            total += comp.getResultado();
        return total;
    }
}
