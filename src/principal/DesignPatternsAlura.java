/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

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

        DesignPatternsAlura.testarStrategy();

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
    
    
}