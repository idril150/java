package logica;

public class Arbusto extends Planta{
    
    String variedad, colorHojas;
    boolean podado, domestico;
    double ancho;

    public Arbusto() {
    }

    public Arbusto(String variedad, String colorHojas, boolean podado, boolean domestico, double ancho, String nombre, String climaIdeal, double altura, boolean hojas) {
        super(nombre, climaIdeal, altura, hojas);
        this.variedad = variedad;
        this.colorHojas = colorHojas;
        this.podado = podado;
        this.domestico = domestico;
        this.ancho = ancho;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public boolean isPodado() {
        return podado;
    }

    public void setPodado(boolean podado) {
        this.podado = podado;
    }

    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    @Override
    public void saludar(){
        System.out.println("hola soy un arbusto "+variedad);
    }
    
}
