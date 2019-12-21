package flyweight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotasMusicais{

    private static Map<String, Nota> notas = new HashMap<String, Nota>();
    private static List<Class<? extends Nota>> classes;

    static{

        classes = Arrays.asList(Do.class,Re.class, Mi.class, Fa.class);

    }
        

    public Nota getNota(String nota){

        if(!notas.containsKey(nota)){

            for(Class<? extends Nota> classe : classes){

                if(classe.getSimpleName().toLowerCase().equals(nota.toLowerCase())){
                    try{
                    notas.put(nota, classe.newInstance());
                    }catch(Exception  e){
                        throw new RuntimeException(e);
                    }
                    break;
                }
            }

        }

        return notas.get(nota);
    }




}