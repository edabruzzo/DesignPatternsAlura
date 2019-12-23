package interpreter;

import visitor.ImpressoraExpressao;

public interface Expressao {

    int avalia();
    void aceita(ImpressoraExpressao visitor);

}