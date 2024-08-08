package claabstractas;


public class Circulo implements Figura, Dibujable, Rotable{

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
    
    @Override
    public double calcularArea() {
        double resultado = Math.PI*Math.pow(radio, 2);
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("P");
    }

    @Override
    public void rotar() {
        System.out.println("d");
    }
    
    
}
