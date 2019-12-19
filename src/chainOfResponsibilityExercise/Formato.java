package chainOfResponsibilityExercise;

import strategy.Conta;


public interface Formato{

    void formataDadosConta(Conta conta, String formato);
    void setProximo(Formato proximo);

}