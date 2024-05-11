
package threads;


public class ParalelismoPorInterface implements Runnable {
     private String nome;
    private int numInicio;
    private int numFim;
    
    public ParalelismoPorInterface(String nome, int numInicio, int numFim) {
        this.nome = nome;
        this.numInicio = numInicio;
        this.numFim = numFim;
    }
    @Override
    public void run(){
         for(int i = numInicio; i < numFim; i++) {
            System.out.println("["+ nome +"]" + i);
    }
    }
}