package interpreter;



public class Subtracao implements Expressao{

    Expressao esquerda;
    Expressao direita;



    public Subtracao(Expressao esquerda, Expressao direita){

        this.esquerda = esquerda;
        this.direita = direita;

    }




	@Override
	public int avalia() {
        int resultadoEsquerda = esquerda.avalia();
        int resultadoDireita = esquerda.avalia();
        
        return resultadoEsquerda - resultadoDireita;

	}





}