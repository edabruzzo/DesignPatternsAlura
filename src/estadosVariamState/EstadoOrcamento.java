package estadosVariamState;

import chainOfResponsibility.Orcamento;

public interface EstadoOrcamento{

    abstract void aplicaDescontoExtra(Orcamento orcamento);
    abstract void aprova(Orcamento orcamento);
    abstract void reprova(Orcamento orcamento);
    abstract void finaliza(Orcamento orcamento);



}