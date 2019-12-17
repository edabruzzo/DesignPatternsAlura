/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainOfResponsibiliy;

/**
 *
 * @author Emm
 */
public class DescontoPorMaisQuinhentosReais implements Desconto{

    
    private Desconto proximo = null;
    
    
    @Override
    public double calculaDesconto(Orcamento orcamento) {

        if(orcamento.getValor() > 500)
            return orcamento.getValor() * 0.07;
        
	if(proximo != null) 
            return proximo.calculaDesconto(orcamento);
    
    	else
		return 0;
    
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
    
    
    
    
}
