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
public class CalculadoraDeDescontos {

    public double calculaDesconto(Orcamento orcamento) {

        Desconto d1 = new DescontoPorMaisCincoItens();
        Desconto d2 = new DescontoPorMaisQuinhentosReais();
        Desconto d3 = new DescontoPorVendaCasada();


	d1.setProximo(d2);
	d2.setProximo(d3);



        double desconto = d1.calculaDesconto(orcamento);

        return desconto;

    }

}
