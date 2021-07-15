
package br.estacio.prii.clube.entidade;

import java.time.LocalDate;

public class Usuario {
    
    private Integer codigo;
    private String nome;
    private String login;
    private String senha;
    private String telefone;
    private String email;
    private Boolean ativo;
    private LocalDate datacadastro;
    
    public Usuario()
    {
        
    }
    
    public Usuario(Integer codigo,String nome,String login,String senha,String telefone,String email,Boolean ativo,LocalDate datacadastro){
        
        this.codigo =  codigo;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.telefone = telefone;
        this.email = email;
        this.ativo = ativo;
        this.datacadastro = datacadastro;
    
    }
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDate getDataCadastro() {
        return datacadastro;
    }

    public void setDataCadastro(LocalDate datacadastro) {
        this.datacadastro = datacadastro;
    }
    
    
    
}
