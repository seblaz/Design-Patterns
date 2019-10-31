package fiuba.algo3.composite;

import java.util.ArrayList;

public class Operando extends Componente {

    private int operando;
    public Operando(int operando){
        this.operando = operando;
    }

    @Override
    public int getResultado() {
        return operando;
    }
}
