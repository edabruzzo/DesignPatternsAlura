package interpreter;

import visitor.ImpressoraExpressao;

public class Subtracao implements Expressao {

    Expressao esquerda;
    Expressao direita;

    public Subtracao(Expressao esquerda, Expressao direita) {

        this.esquerda = esquerda;
        this.direita = direita;

    }

    @Override
    public int avalia() {
        int resultadoEsquerda = esquerda.avalia();
        int resultadoDireita = esquerda.avalia();

        return resultadoEsquerda - resultadoDireita;

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
    public void aceita(ImpressoraExpressao visitor) {

        visitor.visitaSubtracao(this);
    }





}