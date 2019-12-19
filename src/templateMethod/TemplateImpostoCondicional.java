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

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
    public abstract double maximaTaxacao(Orcamento orcamento);
    public abstract double minimaTaxacao(Orcamento orcamento);


}