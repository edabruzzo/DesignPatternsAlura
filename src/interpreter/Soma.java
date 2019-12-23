package interpreter;



public class Soma implements Expressao{

    Expressao esquerda;
    Expressao direita;



    public Soma(Expressao esquerda, Expressao direita){

        this.esquerda = esquerda;
        this.direita = direita;

    }




	@Override
	public int avalia() {

        int resultadoEsquerda = esquerda.avalia();
        int resultadoDireita = esquerda.avalia();
        
        return resultadoEsquerda + resultadoDireita;
	}





}