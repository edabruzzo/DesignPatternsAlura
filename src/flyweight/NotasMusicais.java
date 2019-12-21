package flyweight;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicais{

    private static Map<String, Nota> notas = new HashMap<String, Nota>();

    static{

        notas.put("Do", new Do());
        notas.put("Ré", new Re());
        notas.put("Mi", new Mi());
        notas.put("Fá", new Fa());



    }

        

    public Nota getNota(String nota){
        return notas.get(nota);
    }




}