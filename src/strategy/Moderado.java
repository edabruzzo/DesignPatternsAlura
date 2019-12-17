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
public class Moderado implements Investimento{

    Random random;
    
    public Moderado(){
        
        random = new Random();
    }
    
    
    @Override
    public double calculaRetorno(Conta conta) {
        
        if(random.nextInt(2)==0)
            return conta.getSaldo() * 0.025;
        else 
            return conta.getSaldo() * 0.007;

        
    }
    
    
    
}
