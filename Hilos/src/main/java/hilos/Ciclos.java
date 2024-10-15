package hilos;

public class Ciclos implements Runnable{

    private int numero;
    private int aument;

    public Ciclos(int numero) {
        this.numero = numero;
    }
    
    
    @Override
    public void run() {
        aument=ciclo();        
    }
    
    public int getaument(){
        return aument;
    }
    
    private int ciclo(){
        int a=0;
        for(int i=0;i<=20;i++){
            System.out.println(a);
            a+=numero;
        }
        return a;
    }
    
    
}
