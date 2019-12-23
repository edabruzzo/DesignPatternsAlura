package Command;

public class ConcluirPedido implements Comando {

    private Pedido pedido;

    public ConcluirPedido(Pedido pedido){
        this.pedido = pedido;
    }


    @Override
    public void executa() {

        this.pedido.finalizar();


    }



}