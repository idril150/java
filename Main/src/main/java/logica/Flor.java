package logica;

public class Flor extends Planta{
    
    String tipo, colorPetalos, colorPistilo;
    double promedioPetalos;

    public Flor() {
    }

    public Flor(String tipo, String colorPetalos, String colorPistilo, double promedioPetalos, String nombre, String climaIdeal, double altura, boolean hojas) {
        super(nombre, climaIdeal, altura, hojas);
        this.tipo = tipo;
        this.colorPetalos = colorPetalos;
        this.colorPistilo = colorPistilo;
        this.promedioPetalos = promedioPetalos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public double getPromedioPetalos() {
        return promedioPetalos;
    }

    public void setPromedioPetalos(double promedioPetalos) {
        this.promedioPetalos = promedioPetalos;
    }
    
    @Override
    public void saludar(){
        System.out.println("hola soy una flor "+tipo);
    }
    
}
