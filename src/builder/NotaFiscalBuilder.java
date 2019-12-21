package builder;

import java.util.Calendar;

import chainOfResponsibility.Item;
import chainOfResponsibility.Orcamento;
import observer.*;
import java.util.List;
import java.util.ArrayList;


public class NotaFiscalBuilder{

    String razaoSocial;
    String cnpj;
    Calendar dataEmissao;
    double valorBruto;
    double impostos;
    Orcamento orcamento;
    String observacoes;
    List<AcaoAposGerarNota> listaAcoesAposGerarNota;


    public NotaFiscalBuilder(){
        this.listaAcoesAposGerarNota = new ArrayList<AcaoAposGerarNota>();
    }

    public NotaFiscalBuilder notaComRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
        //retorna ele mesmo para chamar o método construtor ao fim da cadeia
        return this;
    }


    public NotaFiscalBuilder notaComCNPJ(String cnpj){
        this.cnpj = cnpj;
        return this;
    }



    public NotaFiscalBuilder notaComData(Calendar dataEmissao){

            this.dataEmissao = Calendar.getInstance();

        return this;
    }


    public NotaFiscalBuilder notaComValorBruto(Orcamento orcamento){
        double valorBruto = 0;

        for(Item item : orcamento.getItens()){

            valorBruto += item.getValor();

        }
        
        this.valorBruto = valorBruto;
        return this;
    }



    public NotaFiscalBuilder notaComImposto(Orcamento orcamento){

        double valorImposto = 0;

        for(Item item : orcamento.getItens()){

            valorImposto += item.getValor() * 0.05 ;

        }
        
        this.impostos = valorImposto;
        return this;
    }



    public NotaFiscalBuilder notaComObservacao(String observacoes){

        this.observacoes = observacoes;
        return this;
    }



    public NotaFiscalBuilder notaComOrcamento(Orcamento orcamento){

        this.orcamento = orcamento;
        return this;
    }



    public NotaFiscal montaNota(){


        if(this.dataEmissao == null)
            this.dataEmissao = Calendar.getInstance();
        
        NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, valorBruto, impostos, dataEmissao, observacoes, orcamento );

        for(AcaoAposGerarNota acao : listaAcoesAposGerarNota){

            acao.executaAcao(notaFiscal);
        }

        return notaFiscal;
    }


    public void adicionaAcaoAposEmissao(AcaoAposGerarNota acao){

        this.listaAcoesAposGerarNota.add(acao);

    }


}