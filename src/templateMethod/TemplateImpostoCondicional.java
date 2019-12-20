package templateMethod;

import chainOfResponsibility.Orcamento;

public abstract class TemplateImpostoCondicional implements Imposto {


    //este método não pode ser sobrescrito pelas classes filhas, por isso é marcado como final
    public final double calcula(Orcamento orcamento) {

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