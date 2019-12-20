package templateMethod;

import chainOfResponsibility.Orcamento;

public abstract class TemplateImpostoCondicional implements Imposto {


    public double calcula(Orcamento orcamento) {

      if(deveUsarMaximaTaxacao(orcamento)) {
        return maximaTaxacao(orcamento);
      } else {
        return minimaTaxacao(orcamento);
      }

    } 

    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
    protected abstract double maximaTaxacao(Orcamento orcamento);
    protected abstract double minimaTaxacao(Orcamento orcamento);


}