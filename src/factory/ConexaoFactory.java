package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {


    public Connection forneceConexao(){

        Connection conexao = null;
        String banco = System.getenv("tipoBanco");

        try{
        
        if(banco.equalsIgnoreCase("MySQL"))
            conexao =  DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "usuario", "senha");
    
        else if(banco.equalsIgnoreCase("postgres"))
            conexao =  DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "usuario", "senha");
        
        else 
            throw new RuntimeException("Banco de dados não suportado");
        
        }catch(SQLException exc){
            throw new RuntimeException(exc);
        }    
        return conexao;
    }


}