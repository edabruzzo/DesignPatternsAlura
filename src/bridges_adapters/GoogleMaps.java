package bridges_adapters;

import java.net.URL;
import java.io.InputStream;

public class GoogleMaps implements Mapa {

    @Override
    public String devolveMapa(String rua) {
        // regra de negocio
        String google = "https://maps.google.com.br/maps?q="+rua;
    try{
        URL URLgoogle = new URL(google);
        
        InputStream stream = URLgoogle.openStream();
        // le o stream e pega o conteudo

        // faz algo com o mapa
    }catch(Exception e){
        throw new RuntimeException(e);
    }
    
    return null;
    }

}