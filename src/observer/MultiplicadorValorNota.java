package observer;

import builder.NotaFiscal;

public class MultiplicadorValorNota implements AcaoAposGerarNota {

    private double fatorMultiplicacao;

    public MultiplicadorValorNota(double fator){
        this.fatorMultiplicacao = fator;
    }

    @Override
    public void executaAcao(NotaFiscal notafiscal) {

        double valorFinal = notafiscal.getValorBruto() * this.fatorMultiplicacao;
        System.out.println(valorFinal);
    }




}