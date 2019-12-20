package estadosVariamState;

import strategy.Conta;

public class EstadoPositivo extends EstadoConta {

    @Override
    public void deposita(Conta conta, double valor) {

        conta.setSaldo(conta.getSaldo() + valor * 0.98);

        System.out.println(conta.getSaldo());

    }

   
}