package observer;

import builder.NotaFiscal;

public class EnviarEmail implements AcaoAposGerarNota {

    @Override
    public void executaAcao(NotaFiscal notafiscal) {

        /*
        executa uma sére de ações


        */

        System.out.println("Emails enviados");
    }




}