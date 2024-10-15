
package hilos;

public class Calculo implements Runnable{

    private int[] datos;
    private int result;
    
    public Calculo(int[] datos){
        this.datos=datos;
    }
    
    @Override
    public void run() {
        result=calcular(datos);
    }
    
    public int getResult(){
        return result;
    }
    
    private int calcular(int[] data){
        int sum=0;
        for(int a : data){
            sum+=a;
        }
        return sum;
    }
    
}
