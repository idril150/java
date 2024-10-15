
package hilos;

public class Hilos {

    public static void main(String[] args) {
        /*int[][] dataChunks ={
            {1,2,3,4,5},
            {6,7,8,9},
            {9,6,4,2}  
        };
        System.out.println(dataChunks.length);
        Calculo[] calculos = new Calculo[dataChunks.length];
        Thread[] threads = new Thread[dataChunks.length];
        
        for(int i=0; i< dataChunks.length; i++){
            calculos[i] = new Calculo(dataChunks[i]);
            threads[i] = new Thread(calculos[i]);
            threads[i].start();
        }
        
        for(Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        int total=0;
        for(Calculo calculo : calculos){
            total = calculo.getResult();
        }
        System.out.println(total);*/
        int a=1;
        int b=2;
        Ciclos ciclo1 = new Ciclos(a);
        Ciclos ciclo2 = new Ciclos(b);
        Thread thread1 = new Thread(ciclo1,"hilo1");
        Thread thread2 = new Thread(ciclo2, "hilo2");
        thread1.start();
        thread2.start();
        try {
            thread1.join(); // Espera a que thread1 termine
            thread2.join(); // Espera a que thread2 termine
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("el "+thread1.getName()+" termino su proceso");
        System.out.println("el "+thread2.getName()+" termino su proceso");  
        System.out.println(ciclo1.getaument());
        System.out.println(ciclo2.getaument());        
        System.out.println("hola");
    }
}
