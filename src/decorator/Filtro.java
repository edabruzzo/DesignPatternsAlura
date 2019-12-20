package decorator;


import java.util.*;
import strategy.Conta;


public abstract class Filtro{

    protected Filtro outroFiltro;

    public Filtro(Filtro outroFiltro){
        this.outroFiltro = outroFiltro;
    }

    public Filtro(){
        this.outroFiltro = null;
    }


    protected abstract List<Conta> decideQuaisContasFiltrar(List<Conta> contas);
    

}