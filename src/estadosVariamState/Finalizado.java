package estadosVariamState;

import chainOfResponsibility.Orcamento;

class Finalizado implements EstadoOrcamento {

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {

        throw new RuntimeException("O orçamento já está finalizado");
    }


    public void aprova(Orcamento orcamento){

            throw new RuntimeException("O orçamento já está finalizado");
        
    }

    public void reprova(Orcamento orcamento){

        throw new RuntimeException("O orçamento já está finalizado");
    }
 

    public void finaliza(Orcamento orcamento){

        throw new RuntimeException("O orçamento já está finalizado");
    }


} 