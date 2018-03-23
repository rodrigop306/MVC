package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	static Connection conn;
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    private static final String URL = "jdbc:mysql://localhost/bdMvc?autoReconnect=true&useSSL=false";
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    // Conectar ao banco
    public Connection abrir() throws Exception {
        try {
        	Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USUARIO, SENHA);
			System.out.println("Conectado!");
			return conn;
		}catch(SQLException ex) {
			System.out.println("ERRO: "+ex);
		}
        return conn;
    }
    
    public void fechar() throws Exception{
    	if(conn!=null){
    		try{
    			conn.close();
    		}catch(Exception ex){
    			System.out.println("Erro ao fechar conexao");
    		}
    	}else{
    		System.out.println("Conexao inexistente");
    	}
    }

}