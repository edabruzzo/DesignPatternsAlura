package templateMethodRelatorio;

import java.util.*;

import strategy.Conta;

public class RelatorioComplexo extends Relatorio {

    @Override
    protected void cabecalho() {

        System.out.println("BANCO XXXXXX");
        System.out.println("Avenida Paulista, 1234");
        System.out.println("(11) 1234-5678");

    }

    @Override
    protected void corpoRelatorio(List<Conta> contas) {

        for(Conta conta : contas){

            System.out.println("Titular: "+conta.getNomeTitular());
            System.out.println("Agencia: "+conta.getAgencia());
            System.out.println("Número da conta: "+conta.getNumero());
            System.out.println("Saldo: "+conta.getSaldo());

        }

    }

    @Override
    protected void rodape() {

        System.out.println("banco@xyz.com.br");
        System.out.println(Calendar.getInstance().getTime());  

    }






}