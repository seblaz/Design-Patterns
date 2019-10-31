package fiuba.algo3.composite;

public abstract class OperadorConOperandosMax extends Operador {
    private int maxCantidadOperandos;

    OperadorConOperandosMax(int maxCantidadOperandos){
        this.maxCantidadOperandos = maxCantidadOperandos;
    }

    public void agregar(Componente c) {
        if(getOperandos().size() + 1 > maxCantidadOperandos){
            throw new MaximaCantidadOperadoresAlcanzada();
        }
        super.agregar(c);
    }

    protected void validarOperandos() {
        if (getOperandos().size() != maxCantidadOperandos)
            throw new OperacionInvalida();
    }
}
