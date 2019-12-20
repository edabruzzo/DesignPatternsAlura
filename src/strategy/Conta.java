/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.Date;
import estadosVariamState.EstadoConta;
import estadosVariamState.EstadoNegativo;
import estadosVariamState.EstadoPositivo;

/**
 *
 * @author Emm
 */
public class Conta {


    private double saldo;
    private String nomeTitular;
    private String numero;
    private String agencia;
    private Date dataAbertura;
    private EstadoConta estadoAtual;


    /*
    Quem executa as ações é o estado do objeto e não o objeto conta em si

    */

    public void deposita(double valor){
        estadoAtual.deposita(this, valor);
    }


    public void sacar(double valor){
        estadoAtual.sacar(this, valor);
    }


    /**
     * @return the dataAbertura
     */
    public Date getDataAbertura() {
        return dataAbertura;
    }

    
    /**
     * @param dataAbertura the dataAbertura to set
     */
    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }


    public String getNumero(){
        return this.numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    

    /**
     * @return the agencia
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
    void depositar(double d) {
    
        this.setSaldo(saldo + d);
    
    
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    
    /**
     * @return the estadoAtual
     */
    public EstadoConta getEstadoAtual() {
        if(this.getSaldo()<0)
            return new EstadoNegativo();
        else
            return new EstadoPositivo();
    }


    /**
     * @param estadoAtual the estadoAtual to set
     */
    public void setEstadoAtual(EstadoConta estadoAtual) {
        this.estadoAtual = estadoAtual;
    }


}
