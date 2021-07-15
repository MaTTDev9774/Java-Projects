package br.estacio.prii.clube.clubeDAO;

import br.estacio.prii.clube.persistencia.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
 
public abstract class GenericoDAO {
    
    private final Connection connection = Conexao.getDerbyConnection();
    
    protected Statement stmt;
    protected ResultSet rs;
    protected PreparedStatement pstmt;
    
    public Connection getConnection()
    {
        return connection;
    }
    
}
