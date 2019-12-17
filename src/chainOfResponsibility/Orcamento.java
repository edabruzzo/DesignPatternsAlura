/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emm
 */
public class Orcamento {
    
    
    
    private List<Item> itens;
    private double valor;

    
        public Orcamento(){
        itens = new ArrayList<Item>();
    }

    
    
    public List<Item> getItens() {
        return itens;
    }

    
    public double getValor() {
        
        
        for(Item item : itens){
            
            this.valor += item.getValor();
        }
        
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
    
}
