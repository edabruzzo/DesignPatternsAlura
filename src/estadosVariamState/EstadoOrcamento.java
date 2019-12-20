package estadosVariamState;

import chainOfResponsibility.Orcamento;

public abstract class EstadoOrcamento{

    boolean  descontoJahAplicado = false;

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

    public abstract void aplicaDescontoExtra(Orcamento orcamento);
    public abstract void aprova(Orcamento orcamento);
    public abstract void reprova(Orcamento orcamento);
    public abstract void finaliza(Orcamento orcamento);



}