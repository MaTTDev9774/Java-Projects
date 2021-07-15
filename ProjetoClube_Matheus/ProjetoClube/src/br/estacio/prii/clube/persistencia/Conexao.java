package br.estacio.prii.clube.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexao 
{
    private static Connection connection;
    private static String database;
    private static String usuario;
    private static String senha;
    private static String url;
    
    private Conexao()
    { }
    
   
    public static Connection getDerbyConnection()
    {
        if (connection == null)
            Conexao.createDerbyConnection();
        return connection;
    }
    private static void createDerbyConnection()
    {
        database = "bdclube";
        usuario = "uclube";
        senha = "sclube";
        url = "jdbc:derby://localhost:1527/"+database;
        try
        {
            connection = DriverManager.getConnection(url, usuario, senha);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}

    
