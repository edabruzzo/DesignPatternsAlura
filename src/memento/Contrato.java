package memento;

import java.util.Calendar;


public class Contrato{


    private Calendar dataAssinatura;
    String cliente;
    StatusContrato status;


    public Contrato(){
        this.status = StatusContrato.EM_ELABORACAO;
    }


    public void restaurarEstadoContrato(Estado estado){

        this.cliente = estado.getContrato().getCliente();
        this.dataAssinatura = estado.getContrato().getDataAssinatura();
        this.status = estado.getContrato().getStatus();

    }

    
    public Estado salvaEstadoContrato(){
        return new Estado(this);
    }

    public void avanca(){

        if(this.status == StatusContrato.EM_ELABORACAO)
            this.status = StatusContrato.ASSINADO;
        else if(this.status == StatusContrato.ASSINADO)
            this.status = StatusContrato.VIGENTE;
        else if(this.status == StatusContrato.VIGENTE)
            this.status = StatusContrato.FINALIZADO;

    }


    public void cancela(){
        if(this.status == StatusContrato.EM_ELABORACAO)
            this.status = StatusContrato.CANCELADO;
    }


    public void registrarDescumprimento(){
        if(this.status == StatusContrato.VIGENTE)
            this.status = StatusContrato.DESCUMPRIDO; 
    }

    public void cobrarExtrajudicial(){
        if(this.status == StatusContrato.DESCUMPRIDO)
            this.status = StatusContrato.COBRANCA_EXTRAJUDICIAL;
    }

    public void cobrarJudicial(){
        if(this.status == StatusContrato.DESCUMPRIDO || this.status == StatusContrato.COBRANCA_EXTRAJUDICIAL)
            this.status = StatusContrato.EXECUÇAO_JUDICIAL;
    }






    /**
     * @return the status
     */
    public StatusContrato getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(StatusContrato status) {
        this.status = status;
    }


    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setDataAssinatura(Calendar dataAssinatura){
        this.dataAssinatura = dataAssinatura;
        
    }


    public Calendar getDataAssinatura(){
        return this.dataAssinatura;
        
    }


}