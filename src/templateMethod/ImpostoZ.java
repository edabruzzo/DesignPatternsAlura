package templateMethod;

import chainOfResponsibility.*;
import java.util.*;

public class ImpostoZ extends TemplateImpostoCondicional{

    public ImpostoZ(Imposto outroImposto){
        super(outroImposto);
    }


    public ImpostoZ(){
        super();
    }

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        //regra de Negócio
		return possuiMaisUmItemMesmoNome(orcamento) || possuiMaisUmItemMesmoNomeOutraImplementacao(orcamento);
    }
    


    boolean possuiMaisUmItemMesmoNomeOutraImplementacao(Orcamento orcamento){

        List<String> listaItensOrcamento = new ArrayList<String>();

        boolean possui = false;

        for(Item item : orcamento.getItens()){

            if(listaItensOrcamento.contains(item.getNome())) 
                return true;
            else
                listaItensOrcamento.add(item.getNome()); 
        }    

        return possui;
    }


    boolean possuiMaisUmItemMesmoNome(Orcamento orcamento){

        boolean possui = false;

        for(int i=0; i< orcamento.getItens().size(); i ++){
            for(int j=i+1; i<orcamento.getItens().size(); i++){
                if(orcamento.getItens().get(i).getNome() == orcamento.getItens().get(j).getNome())
                    possui = true;
            }
               
        }    

        return possui;
    }



	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (orcamento.getItens().size() * 0.01);
	}




}

