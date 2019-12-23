package visitor;

import interpreter.*;

public interface Visitor{

    public void visitaSoma(Soma soma);
    public void visitaSubtracao(Subtracao subtracao);
    public void visitaNumero(Numero numero);
    public void visitaRaizQuadrada(RaizQuadrada raiz);
    public void visitaDivisao(Divisao divisao);
    public void visitaMultiplicacao(Multiplicacao multiplicacao);

}