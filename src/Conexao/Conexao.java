package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String USUARIO = "root";
    private static final String SENHA = "";
    private static final String URL = "jdbc:mysql://localhost/bdMvc?autoReconnect=true&useSSL=false";
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    // Conectar ao banco
    public static Connection abrir() throws Exception {
        Connection conexao = null;
        try {
        	Class.forName(DRIVER);
			conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
			System.out.println("Conectado!");
			return conexao;
		}catch(SQLException ex) {
			System.out.println("ERRO: "+ex);
		}
        return conexao;
    }
    
    public void fechar() throws Exception{
    	
    }

}