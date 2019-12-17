/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import chainOfResponsibility.*;
import strategy.*;

/**
 *
 * @author Emm
 */
public class DesignPatternsAlura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

 //       DesignPatternsAlura.testarStrategy();
 //       DesignPatternsAlura.testarChainOfResponsibility();
}

    private static void testarStrategy() {
       
    Conta conta = new Conta();
        conta.setSaldo(10000);
        //Investimento estrategia = new Arrojado();
        Investimento estrategia = new Arrojado();

        
        for (int i = 0; i < 11; i++) {
            RealizadorDeInvestimentos.investirSaldo(conta, estrategia);

        }

    }

    private static void testarChainOfResponsibility() {
    
    CalculadoraDeDescontos calculador = new CalculadoraDeDescontos();
    
    Orcamento orcamento = new Orcamento();
    Item item1 = new Item();
    item1.setNome("Violão");
    item1.setValor(400);
    
    Item item2 = new Item();
    item2.setNome("LAPIS");
    item2.setValor(10);


    Item item3 = new Item();
    item3.setNome("CANETA");
    item3.setValor(15);



    orcamento.getItens().add(item1);
    orcamento.getItens().add(item2);
    orcamento.getItens().add(item3);


    
    double desconto = calculador.calculaDesconto(orcamento);
    
    System.out.println("Valor do desconto = R$ "+desconto);
    
    
    }
    
    
}
