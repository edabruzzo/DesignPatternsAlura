package decorator;

import java.util.ArrayList;
import java.util.List;

import strategy.Conta;

public abstract class TemplateFiltro extends Filtro {


    public TemplateFiltro(Filtro outroFiltro){
        super(outroFiltro);
    }


    public TemplateFiltro(){
        super();
    }

    @Override
    public final List<Conta> decideQuaisContasFiltrar(List<Conta> contas) {
        if(outroFiltro != null){
            List<Conta> listaContasFiltradas = new ArrayList<Conta>(decideQuaisContasFiltrar(contas));
            listaContasFiltradas.addAll(outroFiltro.decideQuaisContasFiltrar(contas));
            return listaContasFiltradas;
        
        }else{
            return decideQuaisContasFiltrar(contas);
        }
            
    }



} 