package estadosVariamState;

import strategy.Conta;

public class EstadoNegativo extends EstadoConta {

    @Override
    public void deposita(Conta conta, double valor) {

        conta.setSaldo(conta.getSaldo() + valor * 0.95);

        System.out.println(conta.getSaldo());

    }

  

}