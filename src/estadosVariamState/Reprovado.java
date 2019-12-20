package estadosVariamState;

import chainOfResponsibility.Orcamento;

class Reprovado implements EstadoOrcamento {

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {

        throw new RuntimeException("O orçamento está reprovado");
    }


    public void aprova(Orcamento orcamento){

            throw new RuntimeException("O orçamento já está reprovado");
        
    }

    public void reprova(Orcamento orcamento){

        throw new RuntimeException("O orçamento já está reprovado");    }
 

    public void finaliza(Orcamento orcamento){

        orcamento.setEstadoAtual(new Finalizado());
    }


} 