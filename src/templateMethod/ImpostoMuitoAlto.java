package templateMethod;

import chainOfResponsibility.Orcamento;

public class ImpostoMuitoAlto extends TemplateImpostoCondicional {

    public ImpostoMuitoAlto(Imposto outroImposto){
        super(outroImposto);
    }


    public ImpostoMuitoAlto(){
        super();
    }


    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return true;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.2;
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return 0;
    }





}