package estadosVariamState;


import strategy.Conta;

public abstract class EstadoConta{

//atualiza saldo e devolve o valor depositado
public abstract void deposita(Conta conta, double valor);


/*
O método sacar tem a mesma lógica tanto para estado positivo, quanto para estado negativo
*/
public void sacar(Conta conta, double valor) {

    if(conta.getSaldo()<0){

        conta.setEstadoAtual(new EstadoNegativo());
        throw new RuntimeException("Não é possível sacar, pois o saldo é negativo");
        
    }else  {

        conta.setSaldo(conta.getSaldo() - valor);
        //necessário verificar o saldo após o saque
        if(conta.getSaldo()<0)
            conta.setEstadoAtual(new EstadoNegativo());
        else
            conta.setEstadoAtual(new EstadoPositivo());
    }
     
        
}



}