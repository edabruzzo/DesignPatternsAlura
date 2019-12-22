package memento;

import java.util.ArrayList;
import java.util.List;

public class HistoricoContrato{

    private List<Estado> estadosSalvos = new ArrayList<Estado>();

    public Estado procuraEstadoContrato(int indice){
        return estadosSalvos.get(indice);
    }


    public void adicionaEstadoContrato(Estado estadoContrato){
        estadosSalvos.add(estadoContrato);
    }







}