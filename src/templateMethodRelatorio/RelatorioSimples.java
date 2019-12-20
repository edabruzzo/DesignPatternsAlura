package templateMethodRelatorio;

import java.util.*;

import strategy.Conta;

public class RelatorioSimples extends Relatorio {

    @Override
    protected void cabecalho() {

        System.out.println("BANCO XXXXXX");

    }


    @Override
    protected void corpoRelatorio(List<Conta> contas) {

        for(Conta conta : contas){

            System.out.println("Número da conta: "+conta.getNumero());
            System.out.println("Saldo: "+conta.getSaldo());

        }

    }

    @Override
    protected void rodape() {

        System.out.println("(11) 1234-5678");

    }




}