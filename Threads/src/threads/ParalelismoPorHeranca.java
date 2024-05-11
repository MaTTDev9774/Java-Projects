
package threads;


public class ParalelismoPorHeranca extends Thread {
    
    private String nome;
    private int numInicio;
    private int numFim;
    
    public ParalelismoPorHeranca(String nome, int numInicio, int numFim){
        this.nome = nome;
        this.numInicio = numInicio;
        this.numFim = numFim;
    }
    
    public void run(){
        for(int i = numInicio; i < numFim; i++){
        System.out.println("["+ nome +"] " + i);
        }
    }
}
