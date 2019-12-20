package templateMethodRelatorio;


import strategy.Conta;
import java.util.List;


public abstract class Relatorio{

protected abstract void cabecalho();
protected abstract void rodape();
protected abstract void corpoRelatorio(List<Conta> contas);

//este método não pode ser sobrescrito pelas classes filhas, por isso é marcado como final
public final void imprime(List<Conta> contas){

    cabecalho();
    corpoRelatorio(contas);
    rodape();
}


}