package templateMethodRelatorio;


import strategy.Conta;
import java.util.List;


public abstract class Relatorio{

protected abstract void cabecalho();
protected abstract void rodape();
protected abstract void corpoRelatorio(List<Conta> contas);


public void imprime(List<Conta> contas){

    cabecalho();
    corpoRelatorio(contas);
    rodape();
}


}