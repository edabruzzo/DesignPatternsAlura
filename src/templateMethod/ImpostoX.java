package templateMethod;

import chainOfResponsibility.*;

public class ImpostoX extends TemplateImpostoCondicional{

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		//implementa outra regra de negócio
		return orcamento.getValor() < 500 ;
    }
    




	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}




}

