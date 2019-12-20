package decorator;

import java.util.*;

import strategy.Conta;

public abstract class TemplateFiltro extends Filtro {

    public TemplateFiltro(Filtro outroFiltro){
        super(outroFiltro);
    }


    public TemplateFiltro(){
        super();
    }

    @Override
    public final List<Conta> filtraContasFraudulentas(List<Conta> contas) {
        if(outroFiltro != null){
            List<Conta> listaContasFiltradas = new ArrayList<Conta>(decideQuaisContasFiltrar(contas));
            listaContasFiltradas.addAll(outroFiltro.decideQuaisContasFiltrar(contas));
            return listaContasFiltradas;
        
        }else{
            return decideQuaisContasFiltrar(contas);
        }
            
    }


    protected abstract List<Conta> decideQuaisContasFiltrar(List<Conta> contas);

} 