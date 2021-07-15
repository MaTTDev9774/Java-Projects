package br.estacio.prii.clube.entidade;

import java.time.LocalDate;


public class Alocacao {
    private String matriculaSocio;
    private int codigoAtividade;
    private LocalDate dataInscricao;
    private float valorMensal;

    public Alocacao() {
    }

    public String getMatriculaSocio() {
        return matriculaSocio;
    }

    public void setMatriculaSocio(String matriculaSocio) {
        this.matriculaSocio = matriculaSocio;
    }

    public int getCodigoAtividade() {
        return codigoAtividade;
    }

    public void setCodigoAtividade(int codigoAtividade) {
        this.codigoAtividade = codigoAtividade;
    }

    public LocalDate getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(LocalDate dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public float getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(float valorMensal) {
        this.valorMensal = valorMensal;
    }
    
    
    
}
