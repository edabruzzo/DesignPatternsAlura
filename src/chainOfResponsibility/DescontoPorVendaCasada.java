/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainOfResponsibility;

/**
 *
 * @author Emm
 */
public class DescontoPorVendaCasada implements Desconto{

    Desconto proximo = null;
    
    
    @Override
    public double calculaDesconto(Orcamento orcamento) {
        
       
	    boolean possuiLapis = false;
	    boolean possuiCaneta = false;
	    
	    
	    for(Item item : orcamento.getItens()){
			
		if(item.getNome().equals("LAPIS"))
			 possuiLapis = true;
		    
		if(item.getNome().equals("CANETA"))
			 possuiCaneta = true;
		    
	    }
	    
	    
	    
	    if(possuiLapis && possuiCaneta)
            return orcamento.getValor() * 0.05;
        if (proximo != null)
            return proximo.calculaDesconto(orcamento);
   	else
	    return 0;
    
    }

    @Override
    public void setProximo(Desconto proximo) {
        
        this.proximo = proximo;
    }
    
    
}
