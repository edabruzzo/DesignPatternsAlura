package flyweight;

import java.util.List;

public class Piano{


    public void toca(List<Nota> musica){

        //http://www.jfugue.org/jfugue-5.0.9.jar
        //http://www.jfugue.org/download.html
        //Player player = new Player();

        StringBuilder musicaEmNotas = new StringBuilder();

        for(Nota nota : musica){

            musicaEmNotas.append(nota.simbolo());
        }

        //player.play(musicaEmNotas.toString());
        System.out.println(musicaEmNotas.toString());
    }



}