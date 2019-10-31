package fiuba.algo3.composite;

public class Potencia extends OperadorConOperandosMax {

    Potencia() {
        super(2);
    }

    @Override
    public int getResultado() {
        validarOperandos();
        return (int) Math.pow(getOperandos().get(0).getResultado(), getOperandos().get(1).getResultado());
    }
}
