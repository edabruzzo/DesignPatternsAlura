package estadosVariamState;

import chainOfResponsibility.Orcamento;

public class EmAprovacao extends EstadoOrcamento {

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
       
        if(!this.isDescontoJahAplicado()){
            orcamento.setValor(orcamento.getValor() - orcamento.getValor() * 0.05);
            this.setDescontoJahAplicado(true);
        }else{
            throw new RuntimeException("Desconto já aplicado!");
        }

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