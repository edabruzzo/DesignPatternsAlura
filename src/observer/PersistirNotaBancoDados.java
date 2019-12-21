package observer;

import builder.NotaFiscal;

public class PersistirNotaBancoDados implements AcaoAposGerarNota {

    @Override
    public void executaAcao(NotaFiscal notafiscal) {

        /*
        executa uma sére de ações


        */

        System.out.println("Nota persistida no banco");
    }




}