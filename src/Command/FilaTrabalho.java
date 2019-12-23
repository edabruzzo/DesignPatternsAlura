package Command;

import java.util.List;
import java.util.ArrayList;

public class FilaTrabalho {

    private List<Comando> comandos;


    public FilaTrabalho() {
        this.comandos = new ArrayList<Comando>();
    }

    public void adiciona(Comando comando) {
        comandos.add(comando);
    }

    public void processaComandos() {

        for (Comando comando : comandos) {

            comando.executa();
        }
    }

}