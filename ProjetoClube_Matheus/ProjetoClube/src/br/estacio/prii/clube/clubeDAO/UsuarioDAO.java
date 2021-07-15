package br.estacio.prii.clube.clubeDAO;

import br.estacio.prii.clube.entidade.Usuario;
import java.util.List;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;


public class UsuarioDAO extends GenericoDAO {
    
    public UsuarioDAO()
    { }
   
    public boolean criarTabela()
    {
        String sql = 
            "CREATE TABLE USUARIOS( " +
            "CODIGO INTEGER NOT NULL " +
            "GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) " +
            "CONSTRAINT PK_USUARIO PRIMARY KEY, " +
            "NOME VARCHAR(50), " +
            "LOGIN VARCHAR(20), " +
            "SENHA VARCHAR(20), " +
            "TELEFONE VARCHAR(15), " +  
            "EMAIL VARCHAR(50), " +
            "ATIVO BOOLEAN," +
            "DTCADASTRO DATE " +
            ")";
        try 
        {
            this.stmt = this.getConnection().createStatement();
            this.stmt.execute(sql);
            this.stmt.close();
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,
                e.getMessage(),
                "Erro no UsuarioDAO...", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
  
    public boolean incluir(Usuario usuario)
    {
        boolean teste;
        String sql = "INSERT INTO USUARIOS " +       
                "(nome,login,senha,telefone,email,ativo,dtcadastro) " +
                "VALUES (?,?,?,?,?,?,?)";        
        try
        {
            this.pstmt = this.getConnection().prepareStatement(sql);
            this.pstmt.setString(1, usuario.getNome());
            this.pstmt.setString(2, usuario.getLogin());
            this.pstmt.setString(3, usuario.getSenha());
            this.pstmt.setString(4, usuario.getTelefone());
            this.pstmt.setString(5, usuario.getEmail());
            this.pstmt.setBoolean(6, usuario.getAtivo());
            this.pstmt.setDate(7, Date.valueOf(usuario.getDataCadastro()));
            teste = this.pstmt.execute();
            this.pstmt.close();
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,
                e.getMessage(),
                "Erro no UsuarioDAO...", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return teste;
    }

    public Usuario consultar(int codigo)
    {
        String sql = "SELECT * FROM USUARIOS WHERE CODIGO = ?";
        Usuario usuario = null;
        try
        {
            this.pstmt = this.getConnection().prepareStatement(sql);
            this.pstmt.setInt(1, codigo);
            this.rs = this.pstmt.executeQuery();
            while (rs.next()) 
            {
                usuario = new Usuario();
                usuario.setCodigo(rs.getInt("CODIGO"));
                usuario.setNome(rs.getString("NOME"));
                usuario.setLogin(rs.getString("LOGIN"));
                usuario.setSenha(rs.getString("SENHA"));
                usuario.setEmail(rs.getString("EMAIL"));
                usuario.setTelefone(rs.getString("TELEFONE"));
                usuario.setAtivo(rs.getBoolean("ATIVO"));
                usuario.setDataCadastro(
                        LocalDate.parse(rs.getDate("DTCADASTRO").toString()));
            }
            this.rs.close();
            this.pstmt.close();
        }
        catch (SQLException e) 
        {
            e.printStackTrace();
            return null;
        }
        return usuario;
    }

    public List<Usuario> getListaAll() 
    { return null; }

    public List<Usuario> getListaNome(String nome)
    { return null; }

    public boolean alterar(Usuario usuario)
    { return false; }

    public boolean excluir(int codigo)
    { return false; }

}
