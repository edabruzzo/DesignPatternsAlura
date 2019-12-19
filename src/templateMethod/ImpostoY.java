package templateMethod;

import chainOfResponsibility.*;

public class ImpostoY extends TemplateImpostoCondicional{

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && possuiItemMaiorQueCemReais(orcamento);
    }
    


    boolean possuiItemMaiorQueCemReais(Orcamento orcamento){

        boolean possui = false;
        for(Item item : orcamento.getItens()){

            if(item.getValor()>100)
                possui = true;
               
        }    

        return possui;
    }



	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}




}

