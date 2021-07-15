
package br.estacio.prii.clube.entidade;


public class Atividade {
    
    private int codigo;
    private String descricao;
    private float valor;
    private String local;
    private String periodo;
    
    public Atividade() {
    }
        
    public Atividade(int codigo,String descricao,float valor,String local,String periodo){
        
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.local = local;
        this.periodo = periodo;
    
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    
    

}
