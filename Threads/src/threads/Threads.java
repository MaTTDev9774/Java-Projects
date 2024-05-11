
package threads;

public class Threads {

  
    public static void main(String[] args) {
       ParalelismoPorHeranca p3 = new ParalelismoPorHeranca("C", 1, 20);
       ParalelismoPorHeranca p4 = new ParalelismoPorHeranca("D", 11, 20);
       
       Thread t1 = new Thread(p3);
       Thread t2 = new Thread(p4);
       
       t1.start();
       t2.start();

       System.out.println("fim");
    }
    
}
