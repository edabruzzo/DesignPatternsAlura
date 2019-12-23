package visitor;

import interpreter.*;
import visitor.*;


public class ImpressoraPreFixa implements Visitor{

   @Override
   public void visitaSoma(Soma soma){

        System.out.print(" + ");
        System.out.print("(");
        soma.getEsquerda().aceita(this);
        soma.getDireita().aceita(this);
        System.out.print(")");

    }

    @Override
    public void visitaRaizQuadrada(RaizQuadrada raiz){

        System.out.print(" ^ 2");
        System.out.print("(");
        raiz.getExpressao().aceita(this);
        System.out.print(")");

    }

    @Override
    public void visitaSubtracao(Subtracao subtracao){

        System.out.print(" - ");
        System.out.print("(");
        subtracao.getEsquerda().aceita(this);
        subtracao.getDireita().aceita(this);
        System.out.print(")");


    }

    @Override
    public void visitaDivisao(Divisao divisao){

        System.out.print(" / ");
        System.out.print("(");
        divisao.getEsquerda().aceita(this);
        divisao.getDireita().aceita(this);
        System.out.print(")");

    }

    @Override
    public void visitaMultiplicacao(Multiplicacao multiplicacao){

        System.out.print(" * ");
        System.out.print("(");
        multiplicacao.getEsquerda().aceita(this);
        multiplicacao.getDireita().aceita(this);
        System.out.print(")");

    }



    @Override
    public void visitaNumero(Numero numero){

        numero.aceita(this);
        System.out.print("(");
        System.out.print(")");

    }

}