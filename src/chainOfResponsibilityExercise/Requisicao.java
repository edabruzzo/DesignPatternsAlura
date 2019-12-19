/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainOfResponsibilityExercise;

import strategy.Conta;

/**
 *
 * @author Emm
 */
public class Requisicao {


    public void formataDadosConta(Conta conta, String formato){

        FormatoXML  xml = new FormatoXML();
        FormatoCSV csv = new FormatoCSV();
        FormatoPorCento porcento = new FormatoPorCento();


        xml.setProximo(csv);
        csv.setProximo(porcento);

        xml.formataDadosConta(conta, formato);
        


    }


 
}
