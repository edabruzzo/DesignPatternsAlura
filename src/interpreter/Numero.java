package interpreter;

import visitor.ImpressoraExpressao;

public class Numero implements Expressao {

    private int numero;

    public Numero() {
    }

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public int avalia() {
        return numero;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void aceita(ImpressoraExpressao visitor) {
        visitor.visitaNumero(this);
    }





}