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
        return false;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return 0;
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return 0;
    }





}