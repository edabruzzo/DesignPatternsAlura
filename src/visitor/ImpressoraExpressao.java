package visitor;

import interpreter.*;
import visitor.*;


public class ImpressoraExpressao implements Visitor{

   @Override
   public void visitaSoma(Soma soma){

        System.out.print("(");
        soma.getEsquerda().aceita(this);
        System.out.print(" + ");
        soma.getDireita().aceita(this);
        System.out.print(")");

    }

    @Override
    public void visitaRaizQuadrada(RaizQuadrada raiz){

        System.out.print("(");
        raiz.getExpressao().aceita(this);
        System.out.print(" ^ ");
        System.out.print(")");

    }

    @Override
    public void visitaSubtracao(Subtracao subtracao){

        System.out.print("(");
        subtracao.getEsquerda().aceita(this);
        System.out.print(" - ");
        subtracao.getDireita().aceita(this);
        System.out.print(")");


    }

    @Override
    public void visitaDivisao(Divisao divisao){

        System.out.print("(");
        divisao.getEsquerda().aceita(this);
        System.out.print(" / ");
        divisao.getDireita().aceita(this);
        System.out.print(")");

    }

    @Override
    public void visitaMultiplicacao(Multiplicacao multiplicacao){

        System.out.print("(");
        multiplicacao.getEsquerda().aceita(this);
        System.out.print(" * ");
        multiplicacao.getDireita().aceita(this);
        System.out.print(")");

    }



    @Override
    public void visitaNumero(Numero numero){

        System.out.print("(");
        numero.aceita(this);
        System.out.print(")");

    }







}