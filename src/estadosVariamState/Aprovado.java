package estadosVariamState;

import chainOfResponsibility.Orcamento;

class Aprovado extends EstadoOrcamento {

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {

        if(!descontoJahAplicado)
            orcamento.setValor(orcamento.getValor() - orcamento.getValor() * 0.02);
       this.setDescontoJahAplicado(true);
    }


    public void aprova(Orcamento orcamento){

            throw new RuntimeException("O orçamento já está aprovado");
        
    }

    public void reprova(Orcamento orcamento){

        throw new RuntimeException("O orcamento já está aprovado !");
    }
 

    public void finaliza(Orcamento orcamento){

        orcamento.setEstadoAtual(new Finalizado());
    }


} 