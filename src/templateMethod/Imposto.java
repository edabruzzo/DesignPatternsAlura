package templateMethod;

import chainOfResponsibility.Orcamento;

public abstract class Imposto{

    protected final Imposto outroImposto;

    public Imposto(Imposto outroImposto){
        this.outroImposto = outroImposto;
    }

    public Imposto(){
        this.outroImposto = null;
    }

   public abstract double calcula(Orcamento orcamento);
   protected abstract double calculaOutroImposto(Orcamento orcamento);

} 