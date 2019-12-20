package estadosVariamState;

import chainOfResponsibility.Orcamento;

public abstract class EstadoOrcamento{

    boolean  descontoJahAplicado;

    /**
     * @return the descontoJahAplicado
     */
    public boolean isDescontoJahAplicado() {
        return descontoJahAplicado;
    }
    
    /**
     * @param descontoJahAplicado the descontoJahAplicado to set
     */
    public void setDescontoJahAplicado(boolean descontoJahAplicado) {
        this.descontoJahAplicado = descontoJahAplicado;
    }

    abstract void aplicaDescontoExtra(Orcamento orcamento);
    abstract void aprova(Orcamento orcamento);
    abstract void reprova(Orcamento orcamento);
    abstract void finaliza(Orcamento orcamento);



}