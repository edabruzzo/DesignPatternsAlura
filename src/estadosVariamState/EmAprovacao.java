package estadosVariamState;

import chainOfResponsibility.Orcamento;

public class EmAprovacao implements EstadoOrcamento {

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {

            orcamento.setValor(orcamento.getValor() - orcamento.getValor() * 0.05);
    }


    public void aprova(Orcamento orcamento){

            orcamento.setEstadoAtual(new Aprovado());        
    }

    public void reprova(Orcamento orcamento){

        orcamento.setEstadoAtual(new Reprovado());        
    
    }
 

    public void finaliza(Orcamento orcamento){

        new RuntimeException("O orçamento ainda não é passível de finalização, pois está sendo avaliado");    
    }


} 