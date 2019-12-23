package interpreter;

import visitor.Visitor;

public class Multiplicacao implements Expressao {

    Expressao esquerda;
    Expressao direita;

    public Multiplicacao(Expressao esquerda, Expressao direita) {

        this.esquerda = esquerda;
        this.direita = direita;

    }

    @Override
    public int avalia() {

        int resultadoEsquerda = esquerda.avalia();
        int resultadoDireita = esquerda.avalia();

        return resultadoEsquerda * resultadoDireita;
    }

    /**
     * @return the esquerda
     */
    public Expressao getEsquerda() {
        return esquerda;
    }

    /**
     * @param esquerda the esquerda to set
     */
    public void setEsquerda(Expressao esquerda) {
        this.esquerda = esquerda;
    }

    /**
     * @return the direita
     */
    public Expressao getDireita() {
        return direita;
    }

    /**
     * @param direita the direita to set
     */
    public void setDireita(Expressao direita) {
        this.direita = direita;
    }

    @Override
    public void aceita(Visitor visitor) {

        visitor.visitaMultiplicacao(this);

    }






}