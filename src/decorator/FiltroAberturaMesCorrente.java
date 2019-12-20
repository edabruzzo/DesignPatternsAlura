package decorator;

import java.util.*;

import strategy.Conta;

public class FiltroAberturaMesCorrente extends Filtro {

    @Override
    protected List<Conta> decideQuaisContasFiltrar(List<Conta> contas) {
        List<Conta> contasFiltradas = new ArrayList<Conta>();
        for(Conta conta : contas){
            if(conta.getDataAbertura().getMonth() == new Date().getMonth()){
                contasFiltradas.add(conta);
            }
        }
        return contasFiltradas;
    }



    



}