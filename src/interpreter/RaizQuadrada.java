package interpreter;

public class RaizQuadrada implements Expressao {

    Expressao expressao = null;

    public RaizQuadrada(Expressao expressao){

        if(expressao.getClass().equals(new Numero().getClass()))
            this.expressao = expressao;
    }



    @Override
    public int avalia() {

        double numero = 0;

        if(this.expressao != null){
            numero = (double) expressao.avalia();
            return (int) Math.sqrt(numero);

        }else{
            throw new RuntimeException("A expressão passada não é um número");
        }
        
        
    }








}