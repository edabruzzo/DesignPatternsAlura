package chainOfResponsibilityExercise;


public class Conta{


    private double saldo;
    private String nomeTitular;


    
    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo){
        this.saldo = saldo;
    }


    /**
     * @return the nomeTitular
     */
    public String getNomeTitular() {
        return this.nomeTitular;
    }



    /**
     * @param nomeTitular the nomeTitular to set
     */
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }



}