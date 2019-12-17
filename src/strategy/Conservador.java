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
public class Conservador  implements Investimento{

    @Override
    public double calculaRetorno(Conta conta) {

        return conta.getSaldo() * 0.8;
            

    }
    
}
