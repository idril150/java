package logica;

public class Arbol extends Planta{
    
    String variedad, tipoTronco, color, tipoHojas;
    double radioTronco;

    public Arbol() {
    }

    public Arbol(String variedad, String tipoTronco, String color, String tipoHojas, double radioTronco, String nombre, String climaIdeal, double altura, boolean hojas) {
        super(nombre, climaIdeal, altura, hojas);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.color = color;
        this.tipoHojas = tipoHojas;
        this.radioTronco = radioTronco;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoTronco() {
        return tipoTronco;
    }

    public void setTipoTronco(String tipoTronco) {
        this.tipoTronco = tipoTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoHojas() {
        return tipoHojas;
    }

    public void setTipoHojas(String tipoHojas) {
        this.tipoHojas = tipoHojas;
    }

    public double getRadioTronco() {
        return radioTronco;
    }

    public void setRadioTronco(double radioTronco) {
        this.radioTronco = radioTronco;
    }
    
    @Override
    public void saludar(){
        System.out.println("hola soy un arbol "+variedad);
    }
    
}
