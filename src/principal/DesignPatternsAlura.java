/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import chainOfResponsibiliy.CalculadoraDeDescontos;
import chainOfResponsibiliy.Item;
import chainOfResponsibiliy.Orcamento;
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
        DesignPatternsAlura.testarChainOfResponsibility();
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
    
    chainOfResponsibiliy.CalculadoraDeDescontos calculador = new CalculadoraDeDescontos();
    
    Orcamento orcamento = new Orcamento();
    Item item1 = new Item();
    item1.setNome("Violão");
    item1.setValor(800);
    
    orcamento.getItens().add(item1);
    
    double desconto = calculador.calculaDesconto(orcamento);
    
    System.out.println("Valor do desconto = R$ "+desconto);
    
    
    }
    
    
}