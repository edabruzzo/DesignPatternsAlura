package decorator;

import java.util.*;

import strategy.Conta;

public class FiltroSaldoMenorCem extends Filtro {

    @Override
    protected List<Conta> decideQuaisContasFiltrar(List<Conta> contas) {
        List<Conta> contasFiltradas = new ArrayList<Conta>();
        for(Conta conta : contas){
            if(conta.getSaldo()<100){
                contasFiltradas.add(conta);
            }
        }
        return contasFiltradas;
    }



    



}