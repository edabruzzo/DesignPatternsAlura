/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;
import estadosVariamState.*;
/**
 *
 * @author Emm
 */
public class Orcamento {
    
    
    
    private List<Item> itens;
    private double valor;

    EstadoOrcamento estadoAtual;

    public Orcamento(){

        this.estadoAtual = new EmAprovacao();
        itens = new ArrayList<Item>();
    }

    /**
     * @return the estadoAtual
     */
    public EstadoOrcamento getEstadoAtual() {
        return estadoAtual;
    }

    /**
     * @param estadoAtual the estadoAtual to set
     */
    public void setEstadoAtual(EstadoOrcamento estadoAtual) {
        this.estadoAtual = estadoAtual;
    }
    
    public List<Item> getItens() {
        return itens;
    }

    
    public double getValor() {
        
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    


    public void aplicaDescontoExtra() {
        estadoAtual.aplicaDescontoExtra(this);
      }
    
    
      /*

      https://cursos.alura.com.br/course/design-patterns/task/270
      O Orcamento por sua vez, sempre que recebe uma ação que depende do seu estado, repassa a chamada para o seu estado atual:

      Quem aprova, reprova ou finaliza o orcamento não é o próprio orçamento, mas seus diferentes estados,
      que são classes individualizadas


      */

      public void aprova() {
        estadoAtual.aprova(this);
      }

      public void reprova() {
        estadoAtual.reprova(this);
      }

      public void finaliza() {
        estadoAtual.finaliza(this);
      }







}
