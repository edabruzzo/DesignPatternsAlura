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
public interface Desconto {
    
    double calculaDesconto(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
