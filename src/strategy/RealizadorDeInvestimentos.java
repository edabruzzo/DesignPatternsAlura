/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Emm
 */
public class RealizadorDeInvestimentos {

    public static void investirSaldo(Conta conta, Investimento estrategia) {

        double resultado = estrategia.calculaRetorno(conta);
        conta.depositar(resultado * 0.75);
        System.out.println("Novo saldo: " + conta.getSaldo());

    }

}
