package flyweight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*
Abordagem lembra um SingleTon
https://pt.wikipedia.org/wiki/Singleton


https://cursos.alura.com.br/course/design-patterns-2/task/3971
A ideia de ambos é garantir que existam apenas uma única referência para o objeto ao longo do programa.
A diferença é que o Flyweight garante que existam apenas uma única instância de vários elementos. É um "singleton maior".

https://pt.wikipedia.org/wiki/Flyweight
Para que seja seguro o compartilhamento entre clientes e threads, objetos Flyweight devem ser imutáveis. 
Objetos de Flyweight são por definição objetos de valor. 
A identidade de instância do objeto não possui nenhuma consequência se dois valores são considerados iguais. 


http://www.pontov.com.br/site/index.php/arquitetura/51-programacao/126-gerenciando-recursos?showall=1
*/

public class NotasMusicais{

    private static Map<String, Nota> notas = new HashMap<String, Nota>();
    private static List<Class<? extends Nota>> classes;

    static{

        classes = Arrays.asList(
            Do.class, DoSustenido.class, 
            Re.class, ReSustenido.class, 
            Mi.class, Fa.class,
            FaSustenido.class
            );

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