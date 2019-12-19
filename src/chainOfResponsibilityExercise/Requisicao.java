/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainOfResponsibilityExercise;

/**
 *
 * @author Emm
 */
public class Requisicao {

    private String formato;

    /**
     * @param formato the formato to set
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void formataDadosConta(Conta conta, String formato){

        FormatoXML  xml = new FormatoXML();
        FormatoCSV csv = new FormatoCSV();
        FormatoPorCento porcento = new FormatoPorcento();


        xml.setProximo(csv);
        csv.setProximo(porcento);

        xml.formataDadosConta(conta, formato);
        


    }


 
}
