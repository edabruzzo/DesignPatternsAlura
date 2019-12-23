package interpreter;

import visitor.ImpressoraExpressao;

public class RaizQuadrada implements Expressao {

    Expressao expressao = null;

    public RaizQuadrada(Expressao expressao) {

        // if(expressao.getClass().equals(new Numero().getClass()))
        this.expressao = expressao;
    }

    @Override
    public int avalia() {

        int resultado = 0;

        if (this.expressao != null) {

            resultado = (int) Math.sqrt(expressao.avalia());

        } else {
            // throw new RuntimeException("A expressão passada não é um número");
        }

        return resultado;
    }

    /**
     * @return the expressao
     */
    public Expressao getExpressao() {
        return expressao;
    }

    /**
     * @param expressao the expressao to set
     */
    public void setExpressao(Expressao expressao) {
        this.expressao = expressao;
    }

    @Override
    public void aceita(ImpressoraExpressao visitor) {
        visitor.visitaRaizQuadrada(this);
    }









}