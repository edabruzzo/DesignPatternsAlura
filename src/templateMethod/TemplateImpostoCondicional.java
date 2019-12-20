package templateMethod;

import chainOfResponsibility.Orcamento;

public abstract class TemplateImpostoCondicional extends Imposto {

    public TemplateImpostoCondicional(Imposto outroImposto){
        super(outroImposto);
    }


    public TemplateImpostoCondicional(){
      super();
    }

    //este método não pode ser sobrescrito pelas classes filhas, por isso é marcado como final
    public final double calcula(Orcamento orcamento) {

      if(deveUsarMaximaTaxacao(orcamento)) {
        return maximaTaxacao(orcamento) + this.calculaOutroImposto(orcamento);
      } else {
        return minimaTaxacao(orcamento) + this.calculaOutroImposto(orcamento);
      }

    } 



    protected final double calculaOutroImposto(Orcamento orcamento){

      if(this.outroImposto != null)
        return this.outroImposto.calcula(orcamento);
      else
        return 0;
    }






    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
    protected abstract double maximaTaxacao(Orcamento orcamento);
    protected abstract double minimaTaxacao(Orcamento orcamento);


}