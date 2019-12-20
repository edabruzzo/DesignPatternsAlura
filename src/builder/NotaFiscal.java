package builder;


import java.util.Calendar;
import chainOfResponsibility.Orcamento;

public class NotaFiscal{

    private String notaFiscal;
    private String CNPJ;
    private double valorBruto;
    private double impostos;
    private Calendar dataEmissao;
    private String observacoes;
    private Orcamento orcamento;




    public NotaFiscal(String notaFiscal,
    String CNPJ,
    double valorBruto,
    double impostos,
    Calendar dataEmissao,
    String observacoes,
    Orcamento orcamento){


        this.notaFiscal = notaFiscal;
        this.CNPJ = CNPJ;
        this.valorBruto = valorBruto;
        this.impostos = impostos;
        this.dataEmissao = Calendar.getInstance();
        this.observacoes = observacoes;
        this.orcamento = orcamento;






    }







    /**
     * @return the orcamento
     */
    public Orcamento getOrcamento() {
        return orcamento;
    }


    /**
     * @param orcamento the orcamento to set
     */
    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }


    /**
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param observacoes the observacoes to set
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    /**
     * @return the dataEmissao
     */
    public Calendar getDataEmissao() {
        return dataEmissao;
    }

    /**
     * @param dataEmissao the dataEmissao to set
     */
    public void setDataEmissao(Calendar dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    /**
     * @return the impostos
     */
    public double getImpostos() {
        return impostos;
    }

    /**
     * @param impostos the impostos to set
     */
    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }

    /**
     * @return the valorBruto
     */
    public double getValorBruto() {
        return valorBruto;
    }

    /**
     * @param valorBruto the valorBruto to set
     */
    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }



    /**
     * @return the cNPJ
     */
    public String getCNPJ() {
        return CNPJ;
    }
    
    /**
     * @param cNPJ the cNPJ to set
     */
    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }

    /**
     * @return the notaFiscal
     */
    public String getNotaFiscal() {
        return notaFiscal;
    }

    /**
     * @param notaFiscal the notaFiscal to set
     */
    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }



}