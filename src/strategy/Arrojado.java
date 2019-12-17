/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.Random;

/**
 *
 * @author Emm
 */
public class Arrojado implements Investimento {

    Random random;

    public Arrojado() {

        this.random = new Random();
    }

    @Override
    public double calculaRetorno(Conta conta) {

        int chute = random.nextInt(10);

        if (chute>=0 && chute<=1) {
            return conta.getSaldo() * 0.05;
        } 
        else if (chute >= 2 && chute <= 4) {
            return conta.getSaldo() * 0.03;
        } else {
            return conta.getSaldo() * 0.06;
        }

    }

}
