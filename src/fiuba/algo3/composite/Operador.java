package fiuba.algo3.composite;

import java.util.ArrayList;

public abstract class Operador extends Componente {

    private ArrayList<Componente> operandos = new ArrayList<>();

    public void agregar(Componente c) {
        operandos.add(c);
    }

    protected ArrayList<Componente> getOperandos() {
        return operandos;
    }
}
