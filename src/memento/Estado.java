package memento;


public class Estado{

    private Contrato contrato;

    public Estado(Contrato contrato){
        this.contrato = contrato;
    }

    /**
     * @return the contrato
     */
    public Contrato getContrato() {
        return contrato;
    }

    /**
     * @param contrato the contrato to set
     */
    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }



}